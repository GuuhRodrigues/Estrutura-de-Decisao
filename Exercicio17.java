import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Digite com a idade do nadador: ");
		idade=ler.nextInt();

		if (idade>=5&&idade<=12)
			System.out.println("O nadador pertence a categoria Infantil");

		else if (idade>=13&&idade<=17)
			System.out.println("O nadador pertence a categoria Juvenil");

		else if (idade>=18&&idade<=25)
			System.out.println("O nadador pertence a categoria Profissional");

		else
			System.out.println("O nadador não se encaixa em nenhuma categoria");
	}
}