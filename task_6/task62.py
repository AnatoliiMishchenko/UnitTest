
# Класс Bank
class Bank:

 def __init__(self):
        self.balance = 0

 def receive_money(self, amount):
        if amount < 0:
            raise ValueError("Amount must be positive")
        self.balance += amount

# Класс Person
class Person:
    
 def __init__(self, name, bank):
        self.name = name
        self.bank = bank

 def transfer_money(self, amount):
        if amount < 0:
            raise ValueError("Amount must be positive")
        self.bank.receive_money(amount)

# Тесты

#def test_receive_money():
#    bank = Bank()
#    bank.receive_money(100)
#    assert bank.balance == 100
#    print("Тест test_receive_money выполнен успешно!")

#def test_transfer_money():
#    bank = Bank()
#    person = Person("Alice", bank)
#
#    person.transfer_money(50)
#    assert bank.balance == 50
#    print("Тест test_transfer_money выполнен успешно!")
#
#def test_transfer_money_negative_amount():
#    bank = Bank()
#    person = Person("Bob", bank)
#
#    with pytest.raises(ValueError):
#        person.transfer_money(-10)
#    print("Тест test_transfer_money_negative_amount выполнен успешно!")
#
#def test_receive_money_negative_amount():
#    bank = Bank()
#
#   with pytest.raises(ValueError):
#        bank.receive_money(-10)
#    print("Тест test_receive_money_negative_amount выполнен успешно!")##

import pytest

def test_receive_money():
    bank = Bank()
    bank.receive_money(100)
    assert bank.balance == 100
    print("Тест test_receive_money выполнен успешно!")

def test_transfer_money():
    bank = Bank()
    person = Person("Alice", bank)

    person.transfer_money(50)
    assert bank.balance == 50
    print("Тест test_transfer_money выполнен успешно!")

def test_transfer_money_negative_amount():
    bank = Bank()
    person = Person("Bob", bank)

    with pytest.raises(ValueError):
        person.transfer_money(-10)
    print("Тест test_transfer_money_negative_amount выполнен успешно!")

def test_receive_money_negative_amount():
    bank = Bank()

    with pytest.raises(ValueError):
        bank.receive_money(-10)
    print("Тест test_receive_money_negative_amount выполнен успешно!")