package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra m�dia aritm�tica de 3 notas
		
        Scanner sc = new Scanner(System.in);
        System.out.println("M�dia Aritm�tica de tr�s notas\n");
		System.out.println("Digite a primeira nota: ");
		  int nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		  int nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		  int nota3 = sc.nextInt();
		int media = (nota1 + nota2 + nota3)/3;
		System.out.println("A sua m�dia foi " + media + ".");
        
	}

}