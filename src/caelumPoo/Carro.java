package caelumPoo;

public class Carro {

	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	CarroMotor
	motor;

	public void ligar() {
		System.out.println("O Carro está sendo ligado!");
	}

	public void acelerar(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	public int pegarMarcha() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}

}
