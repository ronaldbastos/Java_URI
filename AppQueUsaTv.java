
public class AppQueUsaTv{
    public static void main(String args[]){
        televisao t;          // declaro a TV
        t = new televisao();  // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = false;
        t.canal = 5;
        t.volume = 10;

        televisao x = new televisao();
        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = true;
        x.canal = 9;
        x.volume = 5;

        t.power();
        x.power();
        t.avancarCanal();
        x.avancarCanal();

    }
}