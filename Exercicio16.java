import java.util.Scanner;
public class Exercicio16 {
    public static void main(String [] args) {

        Scanner ler = new Scanner(System.in);

        int num;

        System.out.println("Digite o n�mero");
        num=ler.nextInt();

        if (num%5==0)
        	System.out.println("Este n�mero e divis�vel por 5");
        else
            System.out.println("Este n�mero nao e divis�vel por 5");
    }
}