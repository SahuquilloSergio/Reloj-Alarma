package relojalarma;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Alarma {

    private boolean encendido=true;
    
    public void encender(){
        boolean encendido=true;
    }
    
    public void apagar(){
        boolean encendido=false;
    }
    
    public static void configurarAlarma(){
        JOptionPane.showInputDialog("Hora de la Alarma");
        System.out.println(new Date());
        
    }
    

}
