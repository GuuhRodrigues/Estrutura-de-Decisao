import java.util.Scanner;
public class Ex24{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int a, b, soma;

		System.out.println("Entre com os n�meros: ");
		a=ler.nextInt();
		b=ler.nextInt();

		soma=a+b;

		if(soma>10)
			System.out.println("A Adi��o � "+soma);

	}
}