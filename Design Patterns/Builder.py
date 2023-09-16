class Car:
    def __init__(self):
        self.make = None
        self.model = None
        self.year = None
        self.color = None

    def __str__(self):
        return f"Carro: {self.year} {self.make} {self.model}, Cor: {self.color}"

class CarBuilder:
    def __init__(self):
        self.car = Car()

    def set_make(self, make):
        self.car.make = make
        return self

    def set_model(self, model):
        self.car.model = model
        return self

    def set_year(self, year):
        self.car.year = year
        return self

    def set_color(self, color):
        self.car.color = color
        return self

    def build(self):
        return self.car

builder = CarBuilder()
car = builder.set_make("Ford").set_model("Mustang").set_year(2023).set_color("Vermelho").build()

print(car)