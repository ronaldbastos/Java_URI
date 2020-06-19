import java.util.Scanner;

public class Main{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);
       int a, b, c;

       a = teclado.nextInt();
       b = teclado.nextInt();
       c = a + b;
       System.out.println ("SOMA = "+c);
        
     }
}