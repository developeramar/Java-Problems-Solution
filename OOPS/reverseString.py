def reverse_words(input_string):
    # Split the string into words
    words = input_string.split()

    # Join the words in reverse order
    reversed_string = " ".join(words[::-1])

    return reversed_string

# Input a string
input_string = input("Enter a string: ")

# Call the function to reverse the words
reversed_string = reverse_words(input_string)

print(f"Reversed string: {reversed_string}")