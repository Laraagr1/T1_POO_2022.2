package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra a �rea de um tri�ngulo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que calcula a �rea de um tri�ngulo\n");
		System.out.println("Insira o valor da base: ");
		  float base = sc.nextFloat();
		System.out.println("Insira o valor da altura: ");
		  float altura = sc.nextFloat();
		float area = base * altura / 2;
		System.out.println("A �rea do tri�ngulo � " + area);
          
	}

}