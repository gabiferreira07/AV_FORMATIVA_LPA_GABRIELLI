package AvaliaçãoFormativa;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double lado, area;
		
		System.out.println("Informe o lado do quadrado: ");
		lado = ler.nextDouble();
		
		area = lado * lado;
		System.out.println("A área do quadrado é: " + area);
	}

}
