package aula;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		int num;
		
		System.out.print("Dígite um número: ");
		Scanner teclado = new Scanner(System.in);
	
		num = teclado.nextInt();
		System.out.println("O numéro digitado é: " + num);
		
		Integer numero = num;
		System.out.println("Número com Integer: " + numero);
	}

}
