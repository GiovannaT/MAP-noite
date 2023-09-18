from abc import ABC, abstractmethod

class Operador(ABC):
    @abstractmethod
    def calcular(self, num1, num2):
        pass

class Adicionar(Operador):
    def calcular(self, num1, num2):
        return num1 + num2

class Subtrair(Operador):
    def calcular(self, num1, num2):
        return num1 - num2

class Multiplicar(Operador):
    def calcular(self, num1, num2):
        return num1 * num2

class Dividir(Operador):
    def calcular(self, num1, num2):
        if num2 != 0:
            return num1 / num2
        else:
            raise ValueError("Não pode ser dividido por zero.")

class OperationFactory:
    def create_operation(self, operator):
        if operator == "+":
            return Adicionar()
        elif operator == "-":
            return Subtrair()
        elif operator == "*":
            return Multiplicar()
        elif operator == "/":
            return Dividir()
        else:
            raise ValueError("Operator invalido.")

# Exemplo de uso
factory = OperationFactory()

operation = factory.create_operation("+")
result = operation.calcular(5, 3)
print(result)  

operation = factory.create_operation("-")
result = operation.calcular(5, 3)
print(result)  

operation = factory.create_operation("*")
result = operation.calcular(5, 3)
print(result)

operation = factory.create_operation("/")
result = operation.calcular(6, 3)
print(result)
