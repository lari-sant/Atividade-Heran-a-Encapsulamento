package Model;

public class Aeronave {
	
	private String modelo;
	
	private String cor;
	
	private int peso;
	
	private int numeropassageiros;
	
	private int velocidademax;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getNumeropassageiros() {
		return numeropassageiros;
	}
	public void setNumeropassageiros(int numeropassageiros) {
		this.numeropassageiros = numeropassageiros;
	}
	public int getVelocidademax() {
		return velocidademax;
	}
	public void setVelocidademax(int velocidademax) {
		this.velocidademax = velocidademax;
	}
	public void voando() {
		System.out.println("A aeronave " + this.modelo + "esta em voo");
	}
	public void pouso() {
		System.out.println("A aeronave  " + this.modelo + "esta aterrissando");
	}

}
