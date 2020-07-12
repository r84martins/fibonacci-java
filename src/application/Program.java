package application;

import java.util.Scanner;

import entities.fibonacci;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o tamanho da sequencia fibonacci: ");
		int lenght = sc.nextInt();
		
		fibonacci fib = new fibonacci();
		fib.gerarSeqFibonacci(lenght);		
		System.out.print("Sua sequencia fibonacci é: "  + fib.getResult());		
		
		sc.close();
	}

}
