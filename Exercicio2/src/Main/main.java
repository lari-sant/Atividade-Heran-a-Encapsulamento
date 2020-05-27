package Main;

import Model.Carro;
import Model.Moto;

public class main {
	
	public static void main(String[] args) {
	
	Carro carro = new Carro();
	
	carro.setNumerorodas(4);
	carro.setNumeroporta(4);
	
	carro.colocar();
	carro.destravarporta();
	
	System.out.println("\n-----------------------------\n");
	
	Moto moto = new Moto();
	
	moto.setNumerorodas(2);
	moto.setCapacetecor("Vermelho");
	
	
	}
	
}
