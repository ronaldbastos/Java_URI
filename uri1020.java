import java.util.Scanner;

public class uri1020{
   public static void main(String arg[]){
       Scanner input = new Scanner (System.in);
       
       int idadeDias = input.nextInt();

       int anos, meses, dias;
       int resto;

       anos = idadeDias / 365;  // 400 -> 400 / 365 = 1

       resto = idadeDias % 365; // 400 -> 400 % 365 = 35

       meses = resto / 30;      // 35 -> 35 / 30 = 1
       dias = resto % 30;       // 35 -> 35 % 20 = 5

       System.out.println(anos + " ano(s)");
       System.out.println(anos + " mes(es)");
       System.out.println(anos + " dia(s)");
        
     }
}