import java.util.Scanner;

public class uri1004{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);
       int a, b, prod;

       a = teclado.nextInt();
       b = teclado.nextInt();
       prod = a * b;
       System.out.println ("calculo = "+prod);
        
     }
}