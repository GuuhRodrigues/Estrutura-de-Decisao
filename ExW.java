import java.util.Scanner;
public class ExW {
	public static void main(String [] args) {

		Scanner ler = new Scanner(System.in);

		int a, b, soma, w=0;

		while (w<10) {
			System.out.println("Entre com os números: ");
			a=ler.nextInt();
			b=ler.nextInt();

			soma=a+b;

			System.out.println("A soma dos números é "+ soma);
			w++;
		}
	}
}