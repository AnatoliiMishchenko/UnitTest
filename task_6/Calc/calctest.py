import pytest
from calculator import Calculator

@pytest.fixture
def calc():
    return Calculator()

def test_addition(calc):
    result = calc.add(5, 3)
    assert result == 8, "Сложение не выполнено успешно"
    print(" усВВЛДЛАОЛФАВИРАЫИМЛР/ЫАЛР/ВЛДМДЛ/ЛТВДМТ/ЫДОВМТЮЛО/ЫВЛО/ИМЛ/ЫИВМИ/ЮБИМЖЛОО/Ф УСЕЕСМввавусешно")

def test_subtraction(calc):
    result = calc.subtract(10, 4)
    assert result == 6, "Вычитание не выполнено успешно"
    print(" усшно")

def test_multiplication(calc):
    result = calc.multiply(3, 4)
    assert result == 12, "Умножение не выполнено успешно"
    print(" усшно")

def test_division(calc):
    result = calc.divide(8, 2)
    assert result == 4.0, "Деление не выполнено успешно"
    print(" усшно")
    
def test_division_by_zero(calc):
    with pytest.raises(ValueError) as exc_info:
        calc.divide(10, 0)
    assert str(exc_info.value) == "Division by zero is not allowed", "Исключение не было вызвано"
    print("усшно")