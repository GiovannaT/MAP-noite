package FactoryPP;

public abstract class Barbies {	
	protected String corpo, cabelo; 
}

class Sereia extends Barbies{
	public Sereia() {
		this.corpo = "sereia";
		this.cabelo = "loiro";
	}	
}

class Humana extends Barbies{
	public Humana() {
		this.corpo = "humano";
		this.cabelo = "preto";
	}
}

class FabricaBarbies{ 
public Barbies criarBarbie(String corpo) throws Exception {
	if(corpo.equalsIgnoreCase("Sereia")) return new Sereia();
	else if(corpo.equalsIgnoreCase("Humano")) return new Humana();
	else throw new Exception("Tipo não reconhecido!");
	}
}

