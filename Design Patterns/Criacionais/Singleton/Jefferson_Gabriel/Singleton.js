// Singleton

// Jefferson Gabriel
// Davi Alexandre

class Carro {
    constructor(marca, modelo) {
      this.marca = marca;
      this.modelo = modelo;
      this.velocidadeAtual = 0;
      if (!Carro.instance) { // Se a instância única não existe, cria uma nova
        Carro.instance = this;
      }
      return Carro.instance; // Se a instância única já existe, retorna a instância existente
    }
  
    acelerar(velocidade) {
      this.velocidadeAtual += velocidade;
      console.log(`${this.marca} ${this.modelo} está indo a ${this.velocidadeAtual} km/h.`);
    }
  
    frear() {
      this.velocidadeAtual = 0;
      console.log(`${this.marca} ${this.modelo} parou.`);
    }
  }
  
  // Exemplo de uso
  const carro1 = new Carro('Toyota', 'Hillux');
  carro1.acelerar(50);
  
  const carro2 = new Carro('Honda', 'Civic');
  carro2.acelerar(60);
  
  console.log(carro1 === carro2); // true, porque ambas as variáveis apontam para a mesma instância
  
  carro1.frear();
  carro2.frear();
