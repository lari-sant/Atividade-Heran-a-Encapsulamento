package Main;

import Model.Aeronave;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setCor("Branco");
		aeronave.setModelo("Avião 787-10");
		aeronave.setNumeropassageiros(337);
		aeronave.setPeso(126000);
		aeronave.setVelocidademax(567);
		
		aeronave.voando();
		aeronave.pouso();

	}

}
