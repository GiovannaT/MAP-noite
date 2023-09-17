import copy

class Robo:
    def __init__(self, nome, tipo):
        self.nome = nome
        self.tipo = tipo

    def apresentar(self):
        print(f"Meu nome é {self.nome} e sou um robô do tipo {self.tipo}")

    def clone(self):
        return copy.deepcopy(self)

robo_prototipo = Robo("Robô Protótipo", "Protótipo")

robo = robo_prototipo.clone()
robo.nome = "Robô Personalizado"

robo_prototipo.apresentar()
robo.apresentar()