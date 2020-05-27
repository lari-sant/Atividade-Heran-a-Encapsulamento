package Model;

public class Eletrodomesticos {

	private String marca;
	private String cor;
	private String modelo;
	private Double peso;
	private int volt;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	public void ligar() {
		System.out.println("O eletrodomestico  " + this.modelo + "esta ligado");
	}
	public void desligar() {
		System.out.println("O eletrodomestico  " + this.modelo + "esta desligado");
	}
	
	public void volt() {
		System.out.println("O eletrodomestico é de " + this.volt + "220v");
	}
	
	
	
}
