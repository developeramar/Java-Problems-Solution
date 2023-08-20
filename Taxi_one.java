import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Taxi {
    private int taxiId;
    private String location;
    private int earnings;

    public Taxi(int taxiId) {
        this.taxiId = taxiId;
        this.location = "A";
        this.earnings = 0;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEarnings() {
        return earnings;
    }

    public int calculateFare(int distance) {
        int initialFare = 100;
        int subsequentFare = 10;
        return initialFare + Math.max(0, (distance - 5) * subsequentFare);
    }

    public void updateEarnings(int distance) {
        int fare = calculateFare(distance);
        this.earnings += fare;
    }
}

class TaxiBookingApp {
    private List<Taxi> taxis;

    public TaxiBookingApp(int numTaxis) {
        taxis = new ArrayList<>();
        for (int i = 1; i <= numTaxis; i++) {
            taxis.add(new Taxi(i));
        }
    }

    public Taxi findNearestTaxi(String location) {
        int minDistance = Integer.MAX_VALUE;
        Taxi nearestTaxi = null;
        for (Taxi taxi : taxis) {
            if (taxi.getLocation().equals(location)) {
                return taxi;
            }

            int distance = Math.abs(taxi.getLocation().charAt(0) - location.charAt(0)) * 15;
            if (distance < minDistance) {
                minDistance = distance;
                nearestTaxi = taxi;
            }
        }
        return nearestTaxi;
    }

    public void bookTaxi(String pickupPoint, String dropPoint, int pickupTime) {
        Taxi taxi = findNearestTaxi(pickupPoint);

        if (taxi == null) {
            System.out.println("Booking rejected. No taxi available.");
            return;
        }

        int pickupDistance = Math.abs(taxi.getLocation().charAt(0) - pickupPoint.charAt(0)) * 15;
        int travelDistance = Math.abs(pickupPoint.charAt(0) - dropPoint.charAt(0)) * 15;

        taxi.setLocation(dropPoint);
        int taxiTime = pickupTime + travelDistance / 60;
        taxi.updateEarnings(travelDistance);

        System.out.println("Taxi " + taxi.getTaxiId() + " is booked. Pickup at " + pickupPoint + " at " + pickupTime + " and drop at " + dropPoint + " at " + taxiTime + " hrs. Fare: Rs. " + taxi.calculateFare(travelDistance));
    }
}

public class Taxi_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTaxis = 4;
        TaxiBookingApp taxiApp = new TaxiBookingApp(numTaxis);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Book a Taxi");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter pickup point (A/B/C/D/E/F): ");
                String pickupPoint = scanner.next().toUpperCase();
                System.out.print("Enter drop point (A/B/C/D/E/F): ");
                String dropPoint = scanner.next().toUpperCase();
                System.out.print("Enter pickup time (in hours): ");
                int pickupTime = scanner.nextInt();
                taxiApp.bookTaxi(pickupPoint, dropPoint, pickupTime);
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
