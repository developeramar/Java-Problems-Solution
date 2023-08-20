def calculate_bill_amount(order_list, payment_mode, is_corporate=False, is_student=False):
    # Menu with sub-menu for each product category
    menu = {
        1: {
            "Espresso Coffee": 30,
            "Cappuccino Coffee": 50,
            "Latte Coffee": 70,
        },
        2: {
            "Plain Tea": 30,
            "Assam Tea": 40,
            "Ginger Tea": 50,
            "Cardamom Tea": 70,
            "Masala Tea": 80,
            "Lemon Tea": 80,
            "Green Tea": 90,
            "Organic Darjeeling Tea": 120,
        },
        3: {
            "Hot and Sour Soup": 50,
            "Veg Corn Soup": 60,
            "Tomato Soup": 50,
            "Spicy Tomato Soup": 70,
        },
        4: {
            "Hot Chocolate Drink": 70,
            "Badam Drink": 80,
            "Badam-Pista Drink": 90,
        }
    }

    total_amount = 0

    # Calculate the total bill amount
    for order in order_list:
        category, product = order
        if category in menu and product in menu[category]:
            total_amount += menu[category][product]

    # Apply 10% discount for corporates and students
    if is_corporate or is_student:
        total_amount *= 0.9

    # Calculate GST (5%)
    gst_amount = total_amount * 0.05

    # Calculate the final bill amount including GST
    final_amount = total_amount + gst_amount

    # Apply additional 10% discount for students and corporates paying by card
    if payment_mode == "card" and (is_corporate or is_student):
        final_amount *= 0.9

    return final_amount

def print_menu():
    print("Menu:")
    print("1. Coffee")
    print("2. Tea")
    print("3. Soups")
    print("4. Beverages")
    print("5. Exit")

def print_sub_menu(category):
    print("Sub-menu:")
    for i, product in enumerate(menu[category], start=1):
        print(f"{i}. {product}")

# Input values
menu = {
    1: {
        "Espresso Coffee": 30,
        "Cappuccino Coffee": 50,
        "Latte Coffee": 70,
    },
    2: {
        "Plain Tea": 30,
        "Assam Tea": 40,
        "Ginger Tea": 50,
        "Cardamom Tea": 70,
        "Masala Tea": 80,
        "Lemon Tea": 80,
        "Green Tea": 90,
        "Organic Darjeeling Tea": 120,
    },
    3: {
        "Hot and Sour Soup": 50,
        "Veg Corn Soup": 60,
        "Tomato Soup": 50,
        "Spicy Tomato Soup": 70,
    },
    4: {
        "Hot Chocolate Drink": 70,
        "Badam Drink": 80,
        "Badam-Pista Drink": 90,
    }
}

order_list = []
while True:
    print_menu()
    choice = int(input("Select a category (1-5): "))

    if choice == 5:
        break

    if choice not in menu:
        print("Invalid category.")
        continue

    print_sub_menu(choice)
    product_choice = int(input("Select a product: "))

    if product_choice not in range(1, len(menu[choice]) + 1):
        print("Invalid product.")
        continue

    category = choice
    product = list(menu[choice].keys())[product_choice - 1]
    order_list.append((category, product))

payment_mode = input("Select a payment mode (card/cash/online): ")
if payment_mode == "card":
    card_number = input("Enter the 12-digit card number: ")
    pin = input("Enter the 4-digit PIN: ")
    print("Card Details are Verified Payment Accepted")

elif payment_mode == "cash":
    print("Bill Generated Kindly pay the bill Amount on cash Counter")
elif payment_mode == "online":
    print("Payment link sent on your Mobile Number kindly Pay through it ")
else:
    print("Card Details are Not Verified payment Failed Try With some Other payment Mode")





is_corporate = False  # Change to True if customer is corporate
is_student = False  # Change to True if customer is a student

# Call the function with the provided inputs
bill_amount = calculate_bill_amount(order_list, payment_mode, is_corporate, is_student)
print(f"Bill Amount (including 5% GST): Rs {bill_amount:.2f}")

print("Payment Done Successfully have a great Day!")