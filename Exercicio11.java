import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double fabCar, custoC, disT, imP;

		System.out.println("Entre com o valor de fabrica do carro: ");
		fabCar=ler.nextDouble();

		disT=(fabCar*12)/100;
		imP=(fabCar*45)/100;

		custoC=fabCar+disT+imP;

		System.out.printf("O custo ao consumidor é %.2f ", custoC);
	}
}