package Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Pensao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Quartos[] vect = new Quartos[10];

		System.out.println("Quantos quartos deseja alugar?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Ordem #" + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			vect[room] = new Quartos(name, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
