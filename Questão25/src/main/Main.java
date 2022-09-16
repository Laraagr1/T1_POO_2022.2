package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra a quantidade mínima de ingressos a serem vendidos para os custos do espetáculo sejam alcançados

		System.out.println("Programa que mostra quantos ingressos devem ser vendidos no mínimo\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo total do espetáculo teatral: ");
		  double custo = sc.nextDouble();
		System.out.println("Digite o preço de cada convite: ");
		  double convite = sc.nextDouble();
		Double qtd = custo / convite;
		System.out.format("Devem ser vendidos %.2f convites para que pelo menos o custo do espetáculo seja alcançado!", Math.ceil(qtd));
		
	}

}