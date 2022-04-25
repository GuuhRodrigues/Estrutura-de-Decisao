import java.util.Scanner;
public class Ex26{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		String nome;
		double valC, lucro, valV;

		System.out.println("Escreva o Nome do Produto: ");
		nome=ler.nextLine();
		System.out.println("Entre com o valor de compra deste produto: ");
		valC=ler.nextDouble();

		if (valC<100)
		{
			lucro=valC*70/100;
			valV=lucro+valC;
			System.out.printf("O produto é "+nome+" o valor de compra é "+valC+" e o valor de venda é "+valV);
		}
		else if(valC>=100&&valC<=200)
		{
			lucro=valC*50/100;
			valV=lucro+valC;
			System.out.printf("O produto é "+nome+",o valor de compra é "+valC+" e o valor de venda é "+valV);
		}
		else
		{
			lucro=valC*30/100;
			valV=lucro+valC;
			System.out.println("O produto é "+nome+" o valor de compra é "+valC+" e o valor de venda é "+valV);
		}
	}
}