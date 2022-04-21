import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valAlt, valBase, valA;

		System.out.println("Escreva o numero para altura do triangulo: ");
		valAlt=ler.nextDouble();
		System.out.println("Escreva o numero para a base do triangulo: ");
		valBase=ler.nextDouble();

		valA=valBase*valAlt/2;

		System.out.printf("A área do triângulo é %.2f ", valA );


	}
}