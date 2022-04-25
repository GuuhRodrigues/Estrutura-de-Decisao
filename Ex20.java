import java.util.Scanner;
public class Ex20{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Entre com 2 números: ");
		a=ler.nextInt();
		b=ler.nextInt();

		if(a==b)
			c=a+b;
		else
			c=a*b;
		System.out.println("O valor de A é "+a+", o valor de B é "+b+" e o valor de c é "+c);

	}
}