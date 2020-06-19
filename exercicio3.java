import java.util.Scanner;

public class exercicio3{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);
       
       float salarioMinimo, Kw, ValorKW, Custo, Desconto;

       System.out.println("Digite o salario minimo");
       salarioMinimo = teclado.nextFloat();
       System.out.println("Digite a quantidade de Kw");
       Kw = teclado.nextFloat();

        //processamento
            ValorKW = salarioMinimo / 7 / 100;
            Custo = ValorKW * Kw;
            Desconto = Custo - (Custo * 0.1f);


    // saida
    System.out.printf("O valor em reais KW %.2f\n", ValorKW);
    System.out.printf("O valor a ser pago %.2f\n", Custo);
    System.out.printf("Novo valor com 10%% de desconto %.2f\n", Desconto);
   }
}