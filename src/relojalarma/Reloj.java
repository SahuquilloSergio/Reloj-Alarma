package relojalarma;

import java.util.Date;

public class Reloj {
   static Date hora = new Date();
   static int horas;
   static int minutos;
   static int segundos;
   static String HCompleta=horas+":"+minutos;
    
    
    public Reloj(){
    horas = hora.getHours();
    minutos = hora.getMinutes();
    segundos = hora.getSeconds();
}
    
    public static void sumarH(){
        if(horas<23)
            horas++;
        else{
            horas=0;
        }
    }
    
    public static void sumarMin(){
        if(minutos<59){
            minutos++;
        }else{
            minutos=0;
            if(horas<23){
                horas++;
            }else
                horas=0;
        }
    }
    
    public static void reset(){
        if(segundos<59){
            segundos++;
        }else if(segundos<=60){
            segundos=0;
            if(minutos<59){
                minutos++;
            }else if(minutos<=60){
                minutos=0;
                if(horas<23){
                    horas++;
                }else{
                    horas=0;
                }
            }
        }
        HCompleta=horas+":"+minutos;
    }
}
