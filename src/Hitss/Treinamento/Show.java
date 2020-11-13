package Hitss.Treinamento;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		try {
			int num1, num2;
			
			System.out.println("Digite o 1º número:");
			num1 = teclado.nextInt();
			
			System.out.println("");

			System.out.println("Digite o 2º núemro:");
			num2 = teclado.nextInt();

			System.out.println("");
			
			if (num1 > num2) {
				System.out.println("O 1º número é maior que o 2º número.");
			} else if (num1 < num2) {
				System.out.println("O 2º núemro é maior que o 1º núemro.");
			} else {
				System.out.println("O 1º número é igual ao 2º número.");
			}
				
			
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
