package desafio_academia_capgemini;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A senha deve satisfazer os seguintes critérios: " 
				+ "\n" + "\n" 
				+ "* Possuir no mímino 6 caracteres;" + "\n" 
				+ "* Conter no mínimo 1 dígito;" + "\n" 
				+ "* Conter no mínimo 1 letra minúscula;" + "\n" 
				+ "* Conter no mínimo 1 letra maiúscula;" + "\n" 
				+ "* Conter no mínimo 1 caractere especial (!@#$%^&*()-+)." 
				+ "\n" );
		
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();
		while (senha.length() < 6) {
			System.out.printf("A senha deve conter no mínimo 6 caracteres, portanto devem ser acrescentados no mímino mais %d caracteres.%n", 6 - senha.length());
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextLine();
		}
		String sen = "";
		for (int i=0; i<=senha.length(); i++) {
			sen = "*".repeat(i);
		}
		System.out.println();
		System.out.printf("Nome: %s%nSenha: %s", nome, sen);
		
		sc.close();

	}

}

