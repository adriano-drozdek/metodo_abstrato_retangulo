package entities;

import entities.enums.Cores;

public class Formato {

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

}
