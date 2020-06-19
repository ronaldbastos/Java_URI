import java.util.Scanner; // vou precisar usar a biblioteca Scanner
public class TesteEntrada{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int a,b,c;

        a = 10;
        b = 15;
        c = a+b;

        System.out.println("Valor de a = " +a);
        System.out.println("Valor de b = " +b);
        System.out.println("Valor de c = " +c);

        double d = 3.14;
        System.out.println("Valor de d =" +d);
    }
}