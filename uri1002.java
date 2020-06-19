import java.util.Scanner;

public class uri1002{
   public static void main(String arg[]){
       Scanner teclado = new Scanner (System.in);
       
       double raio, a, n;
        n = 3.14159;
     
       raio = teclado.nextDouble();
       
        a = raio * raio * n;
        
        System.out.printf("A=%.4f\n", a);
    
   }
}