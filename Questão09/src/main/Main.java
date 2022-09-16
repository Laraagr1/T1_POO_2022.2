package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra a área de um triângulo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que calcula a área de um triângulo\n");
		System.out.println("Insira o valor da base: ");
		  float base = sc.nextFloat();
		System.out.println("Insira o valor da altura: ");
		  float altura = sc.nextFloat();
		float area = base * altura / 2;
		System.out.println("A área do triângulo é " + area);
          
	}

}