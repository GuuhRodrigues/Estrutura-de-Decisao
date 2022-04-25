import java.util.Scanner;
public class Ex21{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int a, b;

		System.out.println("Entre com dois números: ");
		a=ler.nextInt();
		b=ler.nextInt();

		if(a>b)
			System.out.println(""+b+" "+a);
		else
			System.out.println(""+a+" "+b);
	}
}