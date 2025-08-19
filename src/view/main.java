package view;

import java.util.Scanner;
import controller.ForeachController;

// Fazer uma aplicação Java em Eclipse, que permita ao usuário, por Scanner ou JOptionPane,
// entrar o tamanho (n) de um vetor de inteiros (limite a entrada a 100) e entrar com os n
// valores. Deve-se fazer uma classe de controle que tenha uma operação que receba o vetor
// como parâmetro, percorra o vetor utilizando for each e, caso o número seja ímpar, exiba o
// número e a indicação que é ímpar e, caso seja par, exiba apenas os múltiplos de 10, e a
// indicação de que são pares e múltiplos de 10. A resposta deve ser um print do console com
// um vetor de entrada de 8 posições.

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ForeachController foreachController = new ForeachController();
		
		int n;
		
		System.out.println("Defina o tamanho do vetor, valido de 0 a 100! ");
		do {
			n = in.nextInt();
			if(n<=0 || n>100) {
				System.out.println("Valor nn permitido!");
				System.out.print("Insira um novo valor: ");
			}
		}while(n>100 || n<=0);
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + " termo do vetor: ");
			arr[i] = in.nextInt();
		}
		
		foreachController.parImpar(arr);
		
	}

}
