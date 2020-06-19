// novo tipo de dado
public class televisao{
    String  marca;
    int     tamanhoTela;
    int     canal =1;
    int     volume =0   ;
    boolean ligada;
    
    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }

    void avancarCanal(){
        if (ligada == true){
            if(canal < 99)
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void voltarCanal(){
        if (ligada == true){
            canal--;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void aumentarVolume(){
        if (ligada == true){
            volume++;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void diminuirVolume(){
        if (ligada == true){
            volume++;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void muteVolume(){
        if (ligada == true){
            volume = 0;
            System.out.println("A TV "+marca+" esta no mute "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }



}