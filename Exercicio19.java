import java.util.Scanner;
public class Exercicio19 {
    public static void main(String [] args) {

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade: ");
        idade=ler.nextInt();

        if (idade<16)
           System.out.println("N�o eleitor");
        else if (idade>=16&&idade<65)
           System.out.println("Eleitor Obrigat�rio");
        else
           System.out.println("Eleitor Facultativo");
    }
}