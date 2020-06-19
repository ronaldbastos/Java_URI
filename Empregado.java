// definição da classe pessoa
public class Empregado{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private String nome;      
    private String cargo;
    private double salario;

    // método construtor para que eu, ao dar "new" num novo objeto,
    // seja obrigado a passar as 4 informações para ele nesta sequencia
    // nome, sobrenome, idade e sexo
    public Empregado(String no, String ca, double sa){
        nome      = no;
        cargo     = ca;
        salario   = sa;
    }

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor
    public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setcargo(String ca){
        cargo = ca;
    }
    public String getcargo(){
        return cargo;
    }
    public void setsalario(double sa){
        salario = sa;
    }
    public double getsalario(){  
        return salario;
    }
     public void aumentarsalario(double percentual){
        salario = salario + salario * percentual /100;
    }
    
    // perfumaria do ISIDRO
    // um método que já retorna uma STRING compondo todas as infos da pessoa
    public String imprimir(){
        return nome+" "+cargo+" "+salario;
    }
   

}