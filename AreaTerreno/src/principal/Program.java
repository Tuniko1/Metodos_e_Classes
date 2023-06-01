package principal;

import java.util.Scanner;
import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		/*Faça um programa com a classe AreaTerreno 
		 *que tem o atributo area e o metodo retorna area com os atributos largura e comprimento. 
		 *Na classe principal peça para o usuario entrar com os dados de largura
		  e retorne o valor do calculo feito no metodo da classe AreaTerreno*/
		
		
		AreaTerreno At = new AreaTerreno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do comprimento:");
		At.comprimento = sc.nextDouble();
		
		System.out.println("Insira o valor da largura:");
		At.largura = sc.nextDouble();
		
		At.retornaArea(At.largura, At.comprimento);
		
		System.out.println("Área: " +At.area+ " m²");
		
		sc.close();
	}

}
