import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double num;

		System.out.println("Entre com o n�mero: ");
		num=ler.nextDouble();

		if (num>0)
			System.out.println("Este n�mero � positivo");

		else if (num==0)
			System.out.println("Este n�mero � nulo");

		else
			System.out.println("Este n�mero � negativo");
	}
}