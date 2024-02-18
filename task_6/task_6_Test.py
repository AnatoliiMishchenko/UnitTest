import pytest
from task6 import calculate_average


def test_calculate_average_with_valid_input():
    numbers = [1, 2, 3, 4, 5]
    exected_average = 3.0
    result = calculate_average(numbers)
    assert result == exected_average


def test_calculate_average_with_empty_list():
    numbers = []
    with pytest.raises(ValueError) as excinfo:
        calculate_average(numbers)
    assert "Список чисел не может быть пустым" in str(excinfo.value)


def test_calculate_average_with_negative_numbers():
    numbers = [-1, -2, -3, -4, -5]
    expected_average = -3.0
    result = calculate_average(numbers)
    assert result == expected_average


def test_calculate_average_with_float_numbers():
    numbers = [0.5, 1.5, 2.5]
    expected_average = 1.5
    result = calculate_average(numbers)
    assert result == expected_average