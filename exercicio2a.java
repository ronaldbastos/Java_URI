import java.util.Scanner;

public class exercicio2a{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);

       float lado, area;

       // entrada (o valor do lado quadrado)
       System.out.println("Digite o lado do quadrado");
       lado = teclado.nextFloat();

       // processamento (Calcular a area)
       area = lado * lado;

       // saida (exibir o valor da area)
       System.out.println("O valor da area ="+area);

    }
}