import java.util.Scanner;
public class uri1115{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int x,y;

        do{
            x= teclado.nextInt();
            y= teclado.nextInt();

            if (x > 0 && y > 0){
                System.out.println("Primeiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
        }while (x != 0 && y != 0);
    }
}