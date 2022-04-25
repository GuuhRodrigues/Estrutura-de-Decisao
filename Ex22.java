import java.util.Scanner;
public class Ex22{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int a, b;

		System.out.println("Entre com dois números: ");
		a=ler.nextInt();
		b=ler.nextInt();

		if(a>b)
			System.out.println(""+a+" "+b);
		else
			System.out.println(""+b+" "+a);
	}
}