import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Entre com o n�mero: ");
		num=ler.nextInt();

		if (num==0)
			System.out.println("Este n�mero � nulo");

		else if (num%2==0)
			System.out.println("Este n�mero � par");

		else
			System.out.println("Este n�mero � impar");

	}
}