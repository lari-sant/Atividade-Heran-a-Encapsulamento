package Main;

import Model.Eletrodomesticos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eletrodomesticos eletrodomestico = new Eletrodomesticos();
		
		eletrodomestico.setMarca("Consul");
		eletrodomestico.setModelo("Geladeira");
		eletrodomestico.setCor("Prata");
		eletrodomestico.setPeso(340);
		eletrodomestico.setVolt(220);
		
		eletrodomestico.ligar();
		eletrodomestico.desligar();
		
		

	}

}
