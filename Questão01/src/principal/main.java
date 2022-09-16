package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Programa que soma 4 números
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que soma 4 números\n");
		System.out.println("Insira o primeiro número: ");
		  int n1 = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		  int n2 = sc.nextInt();
		System.out.println("Insira o terceiro número: ");
		  int n3 = sc.nextInt();
		System.out.println("Insira o quarto número: ");
		  int n4 = sc.nextInt();
		int soma = n1+n2+n3+n4;
		System.out.println("A soma entre " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + " é igual a " + soma + "!");

	}

}