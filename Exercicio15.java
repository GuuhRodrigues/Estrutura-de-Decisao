import java.util.Scanner;
public class Exercicio15 {
  public static void main(String[] args) {

      Scanner ler = new Scanner(System.in);

      String time1, time2;
      int gol1,gol2;

      System.out.println("Digite o nome do primeiro time: ");
      time1=ler.nextLine();
      System.out.println("Digite o nome do segundo time: ");
      time2=ler.nextLine();
      System.out.println("Digite a quantidade de gols marcados pelo " + time1 + ":");
      gol1=ler.nextInt();
      System.out.println("Digite a quantidade de gols marcados pelo " + time2 + ":");
      gol2=ler.nextInt();

	  if (gol1>gol2)
	  	System.out.println(time1 + " é o vencedor");
      else if (gol1==gol2)
        System.out.println("O jogo ficou empatado");
      else
        System.out.println(time2 + " é o vencedor");
    }
}