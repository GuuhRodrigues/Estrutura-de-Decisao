import java.util.Scanner;
public class Exercicio12 {
	public static void main(String [] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Entre com o n�mero: ");
		num=ler.nextInt();

		if (num>0)
			System.out.println("Este n�mero � positivo");

		else
			System.out.println("Este n�mero � negativo");

	}
}