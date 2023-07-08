package nelioEntites;

public class Retangulo {

	public double altura;
	public double largura;

	public Retangulo() {
	}

	public double are() {
		return altura * largura;
	}

	public double perimetro() {
		return altura + altura + largura + largura;
	}

	public double diagonal() {
		return Math.sqrt((altura * altura) + (largura * largura));

	}

}
