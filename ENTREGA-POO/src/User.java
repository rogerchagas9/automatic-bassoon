import Devices.SmartDevice;
import funcoes.InternetBrowser;
import funcoes.MusicPlayer;
import funcoes.Phone;

public class User {
    public static void main(String[] args) {
        SmartDevice dvc = new SmartDevice();

        InternetBrowser internetBrowser = dvc;
        MusicPlayer musicPlayer = dvc;
        Phone phone = dvc;

        internetBrowser.navegar();
        musicPlayer.tocar();
        phone.ligar();
    }
}
