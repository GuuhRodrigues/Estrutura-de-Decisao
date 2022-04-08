import java.util.Scanner;
public class ExW3 {
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int num, w=0, soma=0;

		while (w<5){
			System.out.println("Entre com um número: ");
			num=ler.nextInt();
			soma=soma+num;
			w++;
		}
		System.out.println("A soma dos números é " + soma);
	}
}