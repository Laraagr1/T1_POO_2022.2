package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra quantos degraus de uma certa altura s�o necess�rios para subir uma certa altura 

		System.out.println("Programa que mostra de quantos degraus voc� precisa parar subir uma altura\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a altura do degrau: ");
		  float aDegrau = sc.nextInt();
		System.out.println("Insira a altura que se deseja alcan�ar: ");
		  float aUsuario = sc.nextInt();
		float qtdDegraus = aUsuario / aDegrau;
	    System.out.println("Para subir " + aUsuario + ", voc� precisa de " + qtdDegraus + " degraus!");
		
	}

}