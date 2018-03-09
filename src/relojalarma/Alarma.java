package relojalarma;

import java.util.Date;


public class Alarma {
    static Date hora = new Date();
    static public int horas, minutos, segundos;
    static public String HCompleta=horas+":"+minutos;
    static public boolean encendido=false;

    
   public Alarma(){
//       hora = new Date();
       horas=Reloj.horas;
       minutos = Reloj.minutos;
       segundos = Reloj.segundos;
       HCompleta=horas+":"+minutos;
   }
   
   public static void sumarH(){
    if(horas<23){
        Alarma.horas++;
    }else{
        Alarma.horas=0;
    }
   }
   
   public static void sumarMin(){
       if(minutos<59){
           Alarma.minutos++;
       }else{
           Alarma.minutos=0;
           if(horas<23){
               Alarma.horas++;
           }else{
               Alarma.horas=0;
           }
       }
   }
    
    
    public static void encender(){
        boolean encendido=true;
    }
    
    public static void apagar(){
        boolean encendido=false;
    }
    
    public static String getHCompleta(){
        return horas+":"+minutos;
    }
    

}
