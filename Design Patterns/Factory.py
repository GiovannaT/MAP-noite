class Animal:
    def speak(self):
        pass

class Cachorro(Animal):
    def speak(self):
        return "au au au"

class Gato(Animal):
    def speak(self):
        return "Miau Miau MIAUU"

class AnimalFactory:
    def create_animal(self, animal_type):
        if animal_type == "cachorro":
            return Cachorro()
        elif animal_type == "gato":
            return Gato()
        else:
            return None

factory = AnimalFactory()
dog = factory.create_animal("cachorro")
cat = factory.create_animal("gato")

print(Cachorro.speak())
print(Gato.speak())