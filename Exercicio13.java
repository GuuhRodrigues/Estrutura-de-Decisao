import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double num;

		System.out.println("Entre com o número: ");
		num=ler.nextDouble();

		if (num>0)
			System.out.println("Este número é positivo");

		else if (num==0)
			System.out.println("Este número é nulo");

		else
			System.out.println("Este número é negativo");
	}
}