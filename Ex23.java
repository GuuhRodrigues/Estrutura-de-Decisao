import java.util.Scanner;
public class Ex23{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int a, b, c, eq, isos, esc;

		System.out.println("Digite os lados do tri�ngulo: ");
		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();

		if (a<(b+c)&&b<(c+a)&&c<(a+b)){
			if (a==b&&b==c)
				System.out.println("Tri�ngulo Equil�tero");
			else if(a!=b&&b!=c)
				System.out.println("Tri�ngulo Escaleno");
			else
				System.out.println("Tri�ngulo Is�sceles");
		}
		else
			System.out.println("Os lados informados n�o formam um tri�ngulo");
	}
}