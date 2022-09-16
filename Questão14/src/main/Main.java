package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que diz a sua idade

		System.out.println("Programa que diz a sua idade\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		  int anoAtual = sc.nextInt();
		System.out.println("Digite o ano em que você nasceu: ");
		  int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		System.out.println("Você tem " + idade + " anos!");
		
	}

}