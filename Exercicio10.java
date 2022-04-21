import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		double kmL, volC, cM;

		System.out.println("Entre com a distancia total percorrida: ");
		kmL=ler.nextDouble();
		System.out.println("Entre com o volume de combustivel consumido: ");
		volC=ler.nextDouble();

		cM=kmL/volC;

		System.out.printf("O consumo médio é %.2f ", cM);
	}
}