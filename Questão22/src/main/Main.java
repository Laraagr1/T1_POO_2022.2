package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que calcula o quanto deve ser pago de Kw em uma resid�ncia

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do sal�rio m�nimo: ");
		  float vlrSal = sc.nextFloat();
		System.out.println("Digite a quantidade de quilowatts consumida por resid�ncia: ");
		  float qtdKw = sc.nextFloat();
		float vlrKw = vlrSal / 5;
		float vlrReais = vlrKw * qtdKw;
		float desc = vlrReais * 15 / 100;
		float vlrDesc = vlrReais - desc;
		System.out.format("O valor do quilowatt � %.2f reais.\n", vlrKw);
		System.out.format("O valor a ser pago por essa resid�ncia � %.2f reais.\n", vlrReais);
		System.out.format("O valor a ser pago com desconto � %.2f reais.\n", vlrDesc);
		
	}

}