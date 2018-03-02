package relojalarma;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class RelojAlarma {

    Timer timer1;
    Timer timer2;
    String hora;
    
    public static void main(String[] args) throws InterruptedException {
        Interfaz display = new Interfaz();
        Reloj reloj = new Reloj();
        new RelojAlarma();
    }
        
        public RelojAlarma(){
            
            timer1 = new Timer();
            timer2 = new Timer();
            
            timer1.schedule(new TicTac1(), 0, 1000);
            timer2.schedule(new TicTac2(), 0, 1000);
            
        }
        
        public class TicTac1 extends TimerTask{
        @Override
        public void run() {
            Reloj.sumarH();
            if(Interfaz.reloj_alarma==true){
                Interfaz.mostrarHora();
            }else{
                Interfaz.mostrarAlarma();
            }
        }
            
        }
        
        public class TicTac2 extends TimerTask{
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        @Override
        public void run() {
            if(Reloj.HCompleta.equals(Alarma.getHCompleta())&&Alarma.encendido==true){
                JOptionPane.showMessageDialog(null, "Alarma Sonando");
                toolkit.beep();
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    ex.getMessage();
                }
            }
        }
        
            
        }
        
        

    }

