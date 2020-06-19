import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int codproduto, qtdproduto;
        float conta = 0;

        codproduto = teclado.nextInt();
        qtdproduto = teclado.nextInt();

        if (codproduto == 1){
            conta = qtdproduto * 4f;
        }
        else{
            if (codproduto == 2){
                conta = qtdproduto * 4.5f;
            }
            else{
                if(codproduto == 3){
                    conta = qtdproduto *5f;
                }
                else{
                    if (codproduto == 4){
                        conta = qtdproduto * 2f;
                    }
                    else {
                        if (codproduto == 5){
                            conta = qtdproduto * 1.5f;
                        }
                        
                    }
                }
            }
        }
        System.out.println("Total" +conta);
    }