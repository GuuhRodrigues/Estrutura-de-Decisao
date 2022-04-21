import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float nota1, nota2, nota3, media;

		System.out.println("Entre com as notas: ");
		nota1=ler.nextFloat();
		nota2=ler.nextFloat();
		nota3=ler.nextFloat();

		media=(nota1+nota2+nota3)/3;

		System.out.printf(" A média das notas é %.2f ", media);

	}
}