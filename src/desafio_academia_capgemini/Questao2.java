package desafio_academia_capgemini;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A senha deve satisfazer os seguintes crit�rios: " 
				+ "\n" + "\n" 
				+ "* Possuir no m�mino 6 caracteres;" + "\n" 
				+ "* Conter no m�nimo 1 d�gito;" + "\n" 
				+ "* Conter no m�nimo 1 letra min�scula;" + "\n" 
				+ "* Conter no m�nimo 1 letra mai�scula;" + "\n" 
				+ "* Conter no m�nimo 1 caractere especial (!@#$%^&*()-+)." 
				+ "\n" );
		
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println();
		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();
		while (senha.length() < 6) {
			System.out.printf("A senha deve conter no m�nimo 6 caracteres, portanto devem ser acrescentados no m�mino mais %d caracteres.%n", 6 - senha.length());
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

