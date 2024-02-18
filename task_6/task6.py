##test one
def calculate_average(numbers):
    if not numbers:
        raise ValueError("Список чисел не может быть пустым")
    total = sum(numbers)
    return total / len(numbers)