import java.util.Scanner;
public class ExW2 {
	public static void main(String [] args){
		Scanner ler = new Scanner(System.in);

		int num, pos=0, neg=0, w=0;

		while (w<3)
		{
			System.out.println("Entre com um n�mero: ");
			num=ler.nextInt();

			if(num!=0)
			{
				if (num>0)
					pos=pos+1;
				else
					neg=neg+1;
			}
			else
				System.out.println("N�mero Nulo");
			w++;
		}
		System.out.println("A quantidade de n�meros positivos � " + pos);
		System.out.println("A quantidade de n�meros negativos � " + neg);
	}
}