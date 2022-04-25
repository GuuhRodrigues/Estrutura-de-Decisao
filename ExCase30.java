import java.util.Scanner;
public class ExCase30{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num;
		double sal, aum, nvsal;

		System.out.println("(1)Gerente ");
		System.out.println("(2)Vendedor ");
		System.out.println("(3)Programador ");
		System.out.println("(4)Motorista");
		System.out.println("(5)Vereador ");
		System.out.println("(6)Deputado ");
		System.out.println("Escolha uma função de 1 ao 6: ");
		num=ler.nextInt();
		System.out.println("Entre com o antigo salario: ");
		sal=ler.nextDouble();

		switch(num){
			case 1:
				aum=sal*30/100;
				nvsal=sal+aum;
				System.out.printf("O novo salario do Gerente será de R$%.2f",nvsal);
			break;
			case 2:
				aum=sal*40/100;
				nvsal=sal+aum;
				System.out.printf("O novo salario do Vendedor será de R$%.2f",nvsal);
			break;
			case 3:
				aum=sal*50/100;
				nvsal=sal+aum;
				System.out.printf("O novo salario do Programador será de R$%.2f",nvsal);
			break;
			case 4:
				aum=sal*60/100;
				nvsal=sal+aum;
				System.out.printf("O novo salario do Motorista será de R$%.2f",nvsal);
			break;
			case 5:
				System.out.printf("O salario do Vereador continuará sendo R$%.2f",sal);
			break;
			case 6:
				System.out.printf("O salario do Deputado continuará sendo R$%.2f",sal);
			break;
			default:
				System.out.println("Função Inválida");

		}
	}
}