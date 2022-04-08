import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double salAtual, reaj15, reaj10, reaj5;

		System.out.print("Entre com o salario atual do funcionário: R$");
		salAtual=ler.nextDouble();

		reaj15=(salAtual*15)/100;
		reaj10=(salAtual*10)/100;
		reaj5=(salAtual*5)/100;

		if (salAtual<500.00)
			System.out.println("O valor do reajuste será de R$" + reaj15 + " sendo assim o novo salário será R$" + (salAtual+reaj15));
		else if (salAtual>=500.000&&salAtual<=1000.00)
			System.out.println("O valor do reajuste será de R$" + reaj10 + " sendo assim o novo salário será R$" + (salAtual+reaj10));
		else
			System.out.println("O valor do reajuste será de R$" + reaj5 + " sendo assim o novo salário será R$" + (salAtual+reaj5));

	}
}