class Taxi:
    def __init__(self, taxi_id):
        self.taxi_id = taxi_id
        self.location = 'A'
        self.earnings = 0

    def assign_location(self, location):
        self.location = location

    def calculate_fare(self, distance):
        initial_fare = 100
        subsequent_fare = 10
        return initial_fare + max(0, (distance - 5) * subsequent_fare)

    def update_earnings(self, distance):
        fare = self.calculate_fare(distance)
        self.earnings += fare
        return fare

class TaxiBookingApp:
    def __init__(self, num_taxis):
        self.taxis = [Taxi(i + 1) for i in range(num_taxis)]

    def find_nearest_taxi(self, location):
        min_distance = float('inf')
        nearest_taxi = None
        for taxi in self.taxis:
            if taxi.location == location:
                return taxi

            distance = abs(ord(taxi.location) - ord(location)) * 15
            if distance < min_distance:
                min_distance = distance
                nearest_taxi = taxi

        return nearest_taxi

    def book_taxi(self, pickup_point, drop_point, pickup_time):
        taxi = self.find_nearest_taxi(pickup_point)

        if not taxi:
            print("Booking rejected. No taxi available.")
            return

        pickup_distance = abs(ord(taxi.location) - ord(pickup_point)) * 15
        travel_distance = abs(ord(pickup_point) - ord(drop_point)) * 15

        taxi.assign_location(drop_point)
        taxi_time = pickup_time + travel_distance // 60
        total_fare = taxi.update_earnings(travel_distance)

        print(f"Taxi {taxi.taxi_id} is booked. Pickup at {pickup_point} at {pickup_time} and drop at {drop_point} at {taxi_time}. Fare: Rs. {total_fare}")

        print()
        print("****************************************************************************************")

def main():
    num_taxis = 4
    taxi_app = TaxiBookingApp(num_taxis)

    while True:
        print("\nOptions:")
        print("1. Book a Taxi")
        print("2. Exit")
        print()
        choice = int(input("Enter your choice: "))
        print()

        if choice == 1:
            pickup_point = input("Enter pickup point (A/B/C/D/E/F): ").upper()
            drop_point = input("Enter drop point (A/B/C/D/E/F): ").upper()
            pickup_time = int(input("Enter pickup time (in hours): "))
            taxi_app.book_taxi(pickup_point, drop_point, pickup_time)
        elif choice == 2:
            break
        else:
            print("Invalid choice. Try again.")

if __name__ == "__main__":
    main()
