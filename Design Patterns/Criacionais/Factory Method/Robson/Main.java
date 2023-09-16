package FactoryPP;

public class Main {

	public static void main(String[] args) throws Exception {
		FabricaBarbies f = new FabricaBarbies();
		Barbies barbie = f.criarBarbie("Sereia");
	}

}
