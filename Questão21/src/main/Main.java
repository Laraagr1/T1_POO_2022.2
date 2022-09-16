package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que mostra a distância que uma escada deve ficar da parede para pregar um quadro nela

		System.out.println("Programa que mostra a distância que uma escada deve ficar da parede para pregar um quadro nela\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da escada: ");
		  float tamEscada = sc.nextFloat();
		System.out.println("Digite a altura em que deseja pregar o quadro: ");
		  float altQuadro = sc.nextFloat();
		float distEscada = tamEscada * tamEscada - altQuadro * altQuadro;
		System.out.format("A distância em que se deve ficar a escada é %.2f!", Math.sqrt(distEscada));
		
	}

}