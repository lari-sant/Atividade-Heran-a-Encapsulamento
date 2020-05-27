package Model;

public class Carro extends Veiculo {
	private int numerorodas;
	private int numeroporta;
	private boolean cintoseguranša = false ;
	
	public int getNumerorodas() {
		return numerorodas;
	}
	public void setNumerorodas(int numerorodas) {
		this.numerorodas = numerorodas;
	}
	
	public int getNumeroporta() {
		return numeroporta;
	}
	public void setNumeroporta(int numeroporta) {
		this.numeroporta = numeroporta;
	}
	
	 public void destravarporta() {
     	System.out.println("Destravando porta do " + getModelo() );
     }
	 
	 public void colocar() {
		 this.cintoseguranša = true;
		 System.out.println("Colocando cinto de seguranša" );
		 
	 }
	
}
