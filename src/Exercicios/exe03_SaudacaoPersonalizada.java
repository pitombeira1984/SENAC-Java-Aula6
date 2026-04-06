package Exercicios;

import java.util.Scanner;

	public class exe03_SaudacaoPersonalizada {
	
		public static void main(String[] args) {
	
			try(Scanner sc = new Scanner(System.in)){
				
				String nome;
				
				System.out.print("Digite seu nome: ");
				if(!sc.hasNextLine()) {
					System.out.println("Dados Inválidos");
					return;
			}
				nome = sc.nextLine();
				
				System.out.println("Seja bem vindo " + nome);
		}
	
	}
	
}
