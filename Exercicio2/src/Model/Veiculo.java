package Model;

public class Veiculo {
	   private String cor;
	   private String modelo;
	   private Double velocidade;
	   private boolean ligado = false;
	   private int ano;
	   
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
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public double getVelocidade() {
	        return velocidade;
	    }
		public void setVelocidade(double velocidade) {
			this.velocidade = velocidade;
		}
		 public void ligarDesligar() {
		        if (this.ligado == false) {
		        	System.out.println("O veiculo foi ligado");
		            this.ligado = true;
		        }else {
		        	this.ligado = false;
		        	System.out.println("O veiculo foi desligado");
		        }
		        }
		        
		        public void acelerar() {
		            if (this.ligado == true && this.velocidade < 240) {
		                System.out.println("Acelerando veiculo");
		                this.velocidade += 10;
		            }
		        }

		        public void brecar() {
		            if (this.velocidade > 0) {
		                System.out.println("Brecando veiculo");
		                this.velocidade -= 10;
		            }
		        }
		        
		        public void curva() {
		        	System.out.println("veiculo" + this.modelo + "fazendo curva");
		        }

}
