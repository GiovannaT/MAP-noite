#####Eliza Builder

# Classe Carro
class Carro:
    def __init__(self, marca, modelo, cor, motor, ano):
        self.marca = marca
        self.modelo = modelo
        self.cor = cor
        self.motor = motor
        self.ano = ano

    def __str__(self):
        return f"Carro: {self.marca} {self.modelo}, Cor: {self.cor}, Motor: {self.motor}, Ano: {self.ano}"

# Classe Builder para Carro
class CarroBuilder:
    def __init__(self, marca, modelo):
        self.carro = Carro(marca, modelo, None, None, None)

    def set_cor(self, cor):
        self.carro.cor = cor
        return self

    def set_motor(self, motor):
        self.carro.motor = motor
        return self

    def set_ano(self, ano):
        self.carro.ano = ano
        return self

    def build(self):
        return self.carro

# Exemplo de uso
builder = CarroBuilder("Toyota", "Corolla")
carro = builder.set_cor("Prata").set_motor("1.8L").set_ano(2022).build()

print(carro)
