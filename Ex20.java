import java.util.Scanner;
public class Ex20{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Entre com 2 n�meros: ");
		a=ler.nextInt();
		b=ler.nextInt();

		if(a==b)
			c=a+b;
		else
			c=a*b;
		System.out.println("O valor de A � "+a+", o valor de B � "+b+" e o valor de c � "+c);

	}
}