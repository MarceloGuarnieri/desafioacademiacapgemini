package desafio_academia_capgemini;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho da escada: ");
		int n = sc.nextInt();

		String escada = "";

		for (int i = 1; i <= n; i++) {
			escada += " ".repeat(n - i) + "*".repeat(i) + "\n";
		}
		
		System.out.println(escada);
		
		sc.close();
		
	}

}
