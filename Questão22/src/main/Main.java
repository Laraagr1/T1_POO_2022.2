package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que calcula o quanto deve ser pago de Kw em uma residência

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salário mínimo: ");
		  float vlrSal = sc.nextFloat();
		System.out.println("Digite a quantidade de quilowatts consumida por residência: ");
		  float qtdKw = sc.nextFloat();
		float vlrKw = vlrSal / 5;
		float vlrReais = vlrKw * qtdKw;
		float desc = vlrReais * 15 / 100;
		float vlrDesc = vlrReais - desc;
		System.out.format("O valor do quilowatt é %.2f reais.\n", vlrKw);
		System.out.format("O valor a ser pago por essa residência é %.2f reais.\n", vlrReais);
		System.out.format("O valor a ser pago com desconto é %.2f reais.\n", vlrDesc);
		
	}

}