import java.util.Scanner;
public class Ex22 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a, b,c;

		System.out.println("Entre com o valor de A: ");
		a=ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b=ler.nextInt();

		c=a;
		a=b;
		b=c;

		System.out.println("Agora A vale: " + a + " e b vale: " + b);

	}
}