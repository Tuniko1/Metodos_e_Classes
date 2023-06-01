package principal;

import java.util.Scanner;
import modules.FormulaTriangulo;

public class ProgramT {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 3 valores que representam um triangulo, a partir
		 * desses valores recebidos retorne se é um triangulo isósceles, equilátero,
		 * escaleno.
		 */

		Scanner sc = new Scanner(System.in);
		FormulaTriangulo ft = new FormulaTriangulo();
		char opcao;
		do {
			System.out.println("Insira o valor do 1° lado do triângulo:");
			ft.v1 = sc.nextDouble();

			System.out.println("Insira o valor do 2° lado do triângulo:");
			ft.v2 = sc.nextDouble();

			System.out.println("Insira o valor do 3° lado do triângulo:");
			ft.v3 = sc.nextDouble();

			FormulaTriangulo.retornaTriangulo(ft.v1, ft.v2, ft.v3);

			System.out.println("\nDeseja continuar? sim ou não?");
			opcao = sc.next().charAt(0);
		} while (opcao == 's');
		{
			if (opcao != 's')
				;
			{
				System.out.println("Terminou aqui! :)");
				System.exit(0);
			}
			sc.close();
		}

	}

}
