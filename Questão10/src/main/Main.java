package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que calcula a �rea de um c�rculo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que calcula a �rea de um c�rculo\n");
		System.out.println("Digite o raio do c�culo: ");
		  double raio = sc.nextDouble();
		double pi = 3.1415;
		double area = pi * Math.pow(raio,2);
        System.out.format("A �rea do c�rculo � %.2f ",area);
		
	}

}