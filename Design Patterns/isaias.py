#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER
#Isaias Fernandes BUILDER

class Car:
    def __init__(self, make, model, year, color):
        self.make = make
        self.model = model
        self.year = year
        self.color = color

    def __str__(self):
        return f"Carro: {self.year} {self.make} {self.model}, Cor: {self.color}"

class CarBuilder:
    def set_make(self, make):
        self.make = make
        return self

    def set_model(self, model):
        self.model = model
        return self

    def set_year(self, year):
        self.year = year
        return self

    def set_color(self, color):
        self.color = color
        return self

    def build(self):
        return Car(self.make, self.model, self.year, self.color)

class CarDirector:
    def __init__(self, builder):
        self.builder = builder

    def construct(self):
        return self.builder.set_make("Ford").set_model("Mustang").set_year(2023).set_color("Vermelho").build()

# Uso do Diretor e Construtor
builder = CarBuilder()
director = CarDirector(builder)
car = director.construct()

print(car)

