import pytest

def test_example():
    result = 2 + 2
    if result == 4:
        print("Тест выполнен успешно!")
    else:
        print("Тест завершился неудачей!")
    assert result == 4 