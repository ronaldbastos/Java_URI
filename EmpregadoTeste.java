public class EmpregadoTeste{
    public static void main(String args[]){
        // apenas declarei as referencias
        Empregado e1, e2, e3;

        // aqui vou criar os objetos
        e1 = new Empregado("João","Analista", 1000);
        e2 = new Empregado("Maria","Gerente", 2000);
        e3 = new Empregado("Jose","Diretor", 3000 );

        
        System.out.println(e1.imprimir());
        System.out.println(e2.imprimir());
        System.out.println(e3.imprimir());
        
        e1.aumentarsalario (10);
        e2.aumentarsalario (10);
        e3.aumentarsalario (10);

        System.out.println(e1.imprimir());
        System.out.println(e2.imprimir());
        System.out.println(e3.imprimir());

    }
}