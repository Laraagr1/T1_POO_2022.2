package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Programa que soma 4 n�meros
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que soma 4 n�meros\n");
		System.out.println("Insira o primeiro n�mero: ");
		  int n1 = sc.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		  int n2 = sc.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		  int n3 = sc.nextInt();
		System.out.println("Insira o quarto n�mero: ");
		  int n4 = sc.nextInt();
		int soma = n1+n2+n3+n4;
		System.out.println("A soma entre " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + " � igual a " + soma + "!");

	}

}