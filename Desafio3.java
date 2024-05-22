package AvaliaçãoFormativa;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor1, valor2, resultado=0;
		String operacao; 
		
		System.out.print("Informe valor 1: ");
		valor1 = ler.nextDouble();
		
		System.out.print("Informe valor 2: ");
		valor2 = ler.nextDouble();
		
		System.out.print("Informe a operação desejada +, - ou *: ");
		operacao = ler.next();
		
		if (operacao.equals("+")) {
			resultado = valor1 + valor2;
		}
		else if (operacao.equals("-")) {
			resultado = valor1 - valor2;
		}
		else if (operacao.equals("*")) {
			resultado = valor1 * valor2;
		}
		else {
			System.out.println("Opção Inválida!");
		}
		System.out.println("O resultado é: " + resultado);
	}

}
