import java.util.Scanner;

public class uri1005{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);
       
       double a, b, avarage;

       a = teclado.nextDouble();
       b = teclado.nextDouble();
       
       avarage = (a * 3.5 + b * 7.5) /11;


       System.out.println ("Media = %.5f\n" +avarage);
        
     }
}