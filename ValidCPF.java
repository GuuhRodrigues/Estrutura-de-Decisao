import java.util.Scanner;
public class ValidCPF {
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, valid1, valid2;

		System.out.print("Entre com o cpf: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		n4=ler.nextInt();
		n5=ler.nextInt();
		n6=ler.nextInt();
		n7=ler.nextInt();
		n8=ler.nextInt();
		n9=ler.nextInt();
		n10=ler.nextInt();
		n11=ler.nextInt();

		valid1=n1*1+n2*2+n3*3+n4*4+n5*5+n6*6+n7*7+n8*8+n9*9;
		valid2=n1*0+n2*1+n3*2+n4*3+n5*4+n6*5+n7*6+n8*7+n9*8+n10*9;

		if (valid1%11==n10&&valid2%11==n11)
			System.out.println("CPF Válido");
		else
			System.out.println("CPF Inválido");
	}
}