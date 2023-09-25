class Boneco:
    def __init__(self, nome, altura, cor):
        self.nome = nome
        self.altura = altura
        self.cor = cor
class Boneco:
    def __init__(self, nome, altura, cor):
        self.nome = nome
        self.altura = altura
        self.cor = cor
    def apresentar(self):
        print(f"Olá, meu nome é {self.nome} e sou um boneco de {self.altura} cm de altura.")

boneco1 = Boneco("Boneco1", "180 cm", "Branco")
boneco1.apresentar()
