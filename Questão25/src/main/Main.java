package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra a quantidade m�nima de ingressos a serem vendidos para os custos do espet�culo sejam alcan�ados

		System.out.println("Programa que mostra quantos ingressos devem ser vendidos no m�nimo\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo total do espet�culo teatral: ");
		  double custo = sc.nextDouble();
		System.out.println("Digite o pre�o de cada convite: ");
		  double convite = sc.nextDouble();
		Double qtd = custo / convite;
		System.out.format("Devem ser vendidos %.2f convites para que pelo menos o custo do espet�culo seja alcan�ado!", Math.ceil(qtd));
		
	}

}