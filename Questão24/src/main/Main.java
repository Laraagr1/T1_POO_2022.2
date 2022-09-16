package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que converte horas em minutos

		System.out.println("Programa que converte as horas em minutos\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite que horas são: ");
		  double hora = sc.nextDouble();
		double h = Math.floor(hora);
		double m = hora - h;
		double conversao = (h * 60) - (m * 100);
		System.out.format("%.2f horas são %.2f minutos!",hora,conversao);
		
	}

}