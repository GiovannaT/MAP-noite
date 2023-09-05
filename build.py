# Padrão Builder e o exemplo foi de um Robo
# Venismendes, João Pedro Gomes, Carlos Eduardo, Arthur Lucena
class RoboBuilder:
    def __init__(self):
        self.robo = Robo()

    def set_nome(self, nome):
        self.robo.nome = nome
        return self

    def build(self):
        return self.robo
    
class Robo:
    def __init__(self):
        self.nome = None

    def __str__(self):
        return f'Nome: {self.nome}'

builder = RoboBuilder()
robo = builder.set_nome("Megatron").build()
print(robo)

