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
			
			System.out.println("Digite o 1� n�mero:");
			num1 = teclado.nextInt();
			
			System.out.println("");

			System.out.println("Digite o 2� n�emro:");
			num2 = teclado.nextInt();

			System.out.println("");
			
			if (num1 > num2) {
				System.out.println("O 1� n�mero � maior que o 2� n�mero.");
			} else if (num1 < num2) {
				System.out.println("O 2� n�emro � maior que o 1� n�emro.");
			} else {
				System.out.println("O 1� n�mero � igual ao 2� n�mero.");
			}
				
			
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
