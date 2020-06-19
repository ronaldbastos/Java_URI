// definição da classe pessoa
public class Livro{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private String  titulo;      
    private String  autor;
    private int     ano;
    private String  cateoria;
    private int     estante;
    private int     prateleira;
    private boolean emprestado;


    // método construtor para que eu, ao dar "new" num novo objeto,
    // seja obrigado a passar as 4 informações para ele nesta sequencia
    // nome, sobrenome, idade e sexo
    public Livro(String titulo,String autor,int ano,String cateoria,int estante,int prateleira,boolean emprestado){
        this.titulo      = titulo;    
        this.autor       = autor;
        this.ano         = ano;
        this.cateoria    = cateoria;
        this.estante     = estante;
        this.prateleira  = prateleira;
        this.emprestado  = emprestado;
    }

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor

    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public String gettitulo(){
        return this.titulo;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    public String getautor(){
        return this.autor;
    }
    public void setano(int ano){
        this.ano = ano;
    }
    public int getano(){
        return this.ano;
    }
    public void setcategoria(String cateoria){
        this.cateoria = cateoria;
    }
    public String getcateoria(){
        return this.cateoria;
    }
    public void setestante(int estante){
        this.estante = estante;
    }
    public int getestante(){
        return this.estante;
    }
    public void setprateleira(int prateleira){
        this.prateleira = prateleira;
    }
    public int getprateleira(){
        return this.prateleira;
    }
    public void setemprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    public boolean getemprestado(){
        return this.emprestado;
    }

    // perfumaria do ISIDRO
    // um método que já retorna uma STRING compondo todas as infos da pessoa

    public String imprimir(){
        return titulo+" " autor+" "ano+" "cateoria+" "estante+" "prateleira+" " emprestado;
    }
}