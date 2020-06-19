import java.util.Scanner;
public class LivroTeste{
    public static void main(String args[]){
        // apenas declarei as referencias
        Livro l1, l2, l3, l4, l5;

        // aqio vou criar os objetos
        l1 = new Livro("java","Jão","2020","Tec","1","2",false);
        l2 = new Livro("java2","Jose","","","");
        l3 = new Livro("","","","","");
        l4 = new Livro("","","","","");
        l5 = new Livro("","","","","") ;

        System.out.print (l1.imprimir());
        System.out.print (l2.imprimir());
        System.out.print (l3.imprimir());
        System.out.print (l4.imprimir());
        System.out.print (l5.imprimir());

        l4.setemprestado(true);
    }
}