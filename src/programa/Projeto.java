package programa;

import java.util.Locale;
import java.util.Scanner;

import entities.enums.Cores;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de figuras: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Figura número #" + i);
			System.out.print("Retângulo ou circulo (r/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO) ");
			Cores cor = Cores.valueOf(sc.next());

		}

		sc.close();
	}

}
