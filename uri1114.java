import java.util.Scanner;
public class uri1114{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int senha;

        do {

            senha = teclado.nextInt();

            if ( senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else {
                System.out.println("Senha invalida");
            }
        } while (senha != 2002);
    }
}