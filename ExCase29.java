import java.util.Scanner;
public class ExCase29{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Escreva o número de 1 ao 12: ");
		num=ler.nextInt();

			switch (num){
				case 1:
					System.out.println("Janeiro");
					System.out.println("Este mês tem 31 dias");
				break;
				case 2:
					System.out.println("Fevereiro");
					System.out.println("Este mês tem 28/29 dias");
				break;
				case 3:
					System.out.println("Março");
					System.out.println("Este mês tem 31 dias");
				break;
				case 4:
					System.out.println("Abril");
					System.out.println("Este mês tem 30 dias");
				break;
				case 5:
					System.out.println("Maio");
					System.out.println("Este mês tem 31 dias");
				break;
				case 6:
					System.out.println("Junho");
					System.out.println("Este mês tem 30 dias");
				break;
				case 7:
					System.out.println("Julho");
					System.out.println("Este mês tem 31 dias");
				break;
				case 8:
					System.out.println("Agosto");
					System.out.println("Este mês tem 31 dias");
				break;
				case 9:
					System.out.println("Setembro");
					System.out.println("Este mês tem 30 dias");
				break;
				case 10:
					System.out.println("Outubro");
					System.out.println("Este mês tem 31 dias");
				break;
				case 11:
					System.out.println("Novembro");
					System.out.println("Este mês tem 30 dias");
				break;
				case 12:
					System.out.println("Dezembro");
					System.out.println("Este mês tem 31 dias");
				break;
				default:
					System.out.println("Mês Inválido");
			}
	}
}