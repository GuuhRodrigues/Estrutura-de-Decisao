import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Entre com o número: ");
		num=ler.nextInt();

		if (num==0)
			System.out.println("Este número é nulo");

		else if (num%2==0)
			System.out.println("Este número é par");

		else
			System.out.println("Este número é impar");

	}
}