import java.util.Scanner;

public class exercicio2b{
    public static void main (String arc []){
        Scanner teclado = new Scanner (System.in);

        Float base, altura, area;

        // entrada ( o valor da base)
        System.out.println("Digite o valor da base");
       base = teclado.nextFloat();

       // entrada ( o valor da altura)
        System.out.println("Digite o valor da altura");
       altura = teclado.nextFloat();

       // processamento (Calcular a area)
       area = base * altura;

       // saida (exibir valor da area)
       System.out.println("O valor da area ="+area);
    }
}