package entities;

import entities.enums.Cores;

public abstract class Formato {

	private Cores cor;

	public Formato() {

	}

	public Formato(Cores cor) {
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}

	public abstract double area();

}
