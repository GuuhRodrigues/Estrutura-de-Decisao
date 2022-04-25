import java.util.Scanner;
public class Ex27{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		String nome;
		int idade;

		System.out.println("Nome do Paciente: ");
		nome=ler.nextLine();
		System.out.println("Idade: ");
		idade=ler.nextInt();

		if(idade<=12)
			System.out.println("O Paciente "+nome+" de "+idade+" será atendido pela Pediatria");
		else if(idade>12&&idade<=59)
			System.out.println("O Paciente "+nome+" de "+idade+" será atendido pela Clinica Geral");
		else
			System.out.println("O Paciente "+nome+" de "+idade+" anos será atendido pela Geriatrica");

	}
}