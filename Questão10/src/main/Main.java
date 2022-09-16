package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que calcula a área de um círculo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que calcula a área de um círculo\n");
		System.out.println("Digite o raio do cículo: ");
		  double raio = sc.nextDouble();
		double pi = 3.1415;
		double area = pi * Math.pow(raio,2);
        System.out.format("A área do círculo é %.2f ",area);
		
	}

}