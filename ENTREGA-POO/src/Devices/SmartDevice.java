package Devices;
import funcoes.Phone;
import funcoes.MusicPlayer;
import funcoes.InternetBrowser;

public class SmartDevice implements Phone, MusicPlayer, InternetBrowser {
    public void ligar(){
        System.out.println("Ligando Através da Interface");
    }    

    public void tocar(){
        System.out.println("Escutando musga pela Interface");
    }

    public void navegar(){
        System.out.println("Navegando pela interface");
    }

}
