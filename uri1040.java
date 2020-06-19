import java.util.Scanner;
public class uri1040{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        float n1, n2, n3, n4, media, exame;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();

        media = (n1*2+n2*3+n3*4+n4*1) /10;

        if(media >=7f){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
         }else{
             if (media >=5f){
                System.out.printf("Media: %.1f\n",media);
                System.out.println("Aluno reprovado.");
             }else{
                 System.out.printf("Media: %.1f\n",media);
                 System.out.println("Aluno em exame.");
                 exame=teclado.nextFloat();
                 media=(exame+media)/2;
                 if(media>=5f){
                     System.out.printf("Nota do exame: %.1f\n",exame);
                     System.out.println("Aluno reprovado.");
                     System.out.printf("Media final: %.1f\n",media);
                 }
             }
         }
    }
}