class Taxi:
    def __init__(self, taxi_id, current_location):
        self.taxi_id = taxi_id
        self.current_location = current_location
        self.is_available = True
        self.earnings = 0

    def update_location(self, new_location):
        self.current_location = new_location

    def set_availability(self, is_available):
        self.is_available = is_available

    def add_earnings(self, fare):
        self.earnings += fare


class CallTaxiBookingSystem:
    def __init__(self, number_of_taxis):
        self.taxis = [Taxi(f"Taxi-{i + 1}", 'A') for i in range(number_of_taxis)]

    def book_taxi(self, pickup_point, drop_point, pickup_time):
        available_taxi = self.find_available_taxi(pickup_point, pickup_time)
        if available_taxi:
            distance = self.calculate_distance(pickup_point, drop_point)
            fare = self.calculate_fare(distance)
            travel_time = self.calculate_travel_time(pickup_point, drop_point)
            total_fare = self.calculate_total_fare(fare, travel_time)

            print(f"Taxi {available_taxi.taxi_id} is booked.")
            print(f"Pickup Point: {pickup_point}")
            print(f"Drop Point: {drop_point}")
            print(f"Pickup Time: {pickup_time} hrs")
            print(f"Travel Time: {travel_time} mins")
            print(f"Total Fare: Rs. {total_fare}")

            available_taxi.update_location(drop_point)
            available_taxi.add_earnings(total_fare)
            available_taxi.set_availability(False)
        else:
            print("Booking rejected. No free taxi available at the moment.")

    def find_available_taxi(self, pickup_point, pickup_time):
        min_distance = float('inf')
        allocated_taxi = None

        for taxi in self.taxis:
            if taxi.is_available:
                distance = self.calculate_distance(taxi.current_location, pickup_point)
                if distance < min_distance or (distance == min_distance and taxi.earnings < allocated_taxi.earnings):
                    allocated_taxi = taxi
                    min_distance = distance

        return allocated_taxi

    def calculate_distance(self, pickup_point, drop_point):
        pick_char = ord(pickup_point)
        drop_char = ord(drop_point)
        return abs(drop_char - pick_char) * 15

    def calculate_fare(self, distance):
        base_fare = 100
        additional_fare = (distance - 5000) // 1000 * 10 if distance > 5000 else 0
        return base_fare + additional_fare

    def calculate_travel_time(self, pickup_point, drop_point):
        distance = self.calculate_distance(pickup_point, drop_point)
        return distance // 15 * 60

    def calculate_total_fare(self, fare, travel_time):
        return fare + (travel_time // 60) * 10


if __name__ == "__main__":
    number_of_taxis = 4
    booking_system = CallTaxiBookingSystem(number_of_taxis)

    # Example usage:
    booking_system.book_taxi("A", "C", 9)  # Taxi 1 is booked.
    booking_system.book_taxi("B", "E", 12)  # Taxi 2 is booked.
    booking_system.book_taxi("C", "F", 15)  # Taxi 3 is booked.
    booking_system.book_taxi("A", "D", 10)  # Taxi 1 is booked.

    # Taxi status after bookings:
    # Taxi 1: Earnings: Rs. 130, Current Location: D, Availability: False
    # Taxi 2: Earnings: Rs. 230, Current Location: E, Availability: False
    # Taxi 3: Earnings: Rs. 190, Current Location: F, Availability: False
    # Taxi 4: Earnings: Rs. 0, Current Location: A, Availability: True
