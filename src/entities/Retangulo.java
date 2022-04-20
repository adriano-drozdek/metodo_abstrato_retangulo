package entities;

import entities.enums.Cores;

public class Retangulo extends Formato {

	private Double altura;
	private Double largura;

	public Retangulo() {
		super();
	}

	public Retangulo(Cores cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	@Override
	public double area() {
		return altura * largura;
	}

}
