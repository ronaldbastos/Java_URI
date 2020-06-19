import java.util.Scanner;

public class exercicio4{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);
       
       float valorHora, qtdHoras, descontoINSS, salarioLiquido;

       // Entrada 

       System.out.println("Digite o valor da hora");
       valorHora = teclado.nextFloat();
       System.out.println("Digite a quantidade de horas trabalhadas");
       qtdHoras = teclado.nextFloat();
        System.out.println("Digite a %% de desconto do INSS");
       descontoINSS = teclado.nextFloat();
       descontoINSS = descontoINSS / 100f;

        //processamento
        salarioLiquido = (valorHora * qtdHoras);
        descontoINSS = salarioLiquido - salarioLiquido * descontoINSS;


    // saida
    System.out.printf("O salario liquido é %.2f\n", salarioLiquido);
    
   }
}