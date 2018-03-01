package relojalarma;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class RelojAlarma {
    Alarma A1 = new Alarma();
    Timer temporizador;
    String alarma="Arriba puto vago, levanta ya, ARRIBA ESPAÑA COÑO";

    public static void main(String[] args) throws InterruptedException {
        new Principal();
        

    }

}
