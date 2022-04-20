package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Formato;
import entities.Retangulo;
import entities.enums.Cores;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Formato> list = new ArrayList<>();
		
		System.out.println("Informe a quantidade de figuras: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Figura número #" + i);
			System.out.print("Retângulo ou circulo (r/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO) ");
			Cores cor = Cores.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.println("Largura: ");
				double largura = sc.nextDouble();
				System.out.println("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
			
		}

		sc.close();
	}

}
