import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Ahora {
    public static void main(String[] args) {

        //Clase Date JDK 1.0
        //System.out.println(new java.util.Date());
        //System.out.println(new Date());

        //Clase Calendar JDK 1.1
        //System.out.println(Calendar.getInstance());
        //System.out.println(Calendar.getInstance().getTime());

        //Clase LocalDateTime, LocalDate, LocalTime JDK8
        //System.out.println(LocalDateTime.now());
        //System.out.println(LocalDate.now());
        //System.out.println(LocalTime.now());

        //Obtenemos datos de fecha y hora
        Calendar cal=Calendar.getInstance();
        String ubicacion=cal.getTimeZone().getID();
        ubicacion=ubicacion.replaceAll("/", " - ");
        //System.out.println(ubicacion);

        LocalDateTime ldt=LocalDateTime.now();
        int anio=ldt.getYear();
        int mes=ldt.getMonthValue();
        int dia=ldt.getDayOfMonth();
        int diaSem=ldt.getDayOfWeek().getValue();
        int hora=ldt.getHour();
        int minuto=ldt.getMinute();

        String nombreDia="";
        String nombreMes="";

        //String month=ldt.getMonth().toString();
        //if(month.equals("AUGUST")) nombreMes="Agosto"; 

        //Obtenemos el nombre del día de la semana
        // if(diaSem==1)   nombreDia="Lunes";
        // if(diaSem==2)   nombreDia="Martes";
        // if(diaSem==3)   nombreDia="Miércoles";
        // if(diaSem==4)   nombreDia="Jueves";
        // if(diaSem==5)   nombreDia="Viernes";
        // if(diaSem==6)   nombreDia="Sábado";
        // if(diaSem==7)   nombreDia="Domingo";

        switch(diaSem){
            case 1:         nombreDia="Lunes";      break;   
            case 2:         nombreDia="Martes";     break;  
            case 3:         nombreDia="Miércoles";  break;  
            case 4:         nombreDia="Jueves";     break;  
            case 5:         nombreDia="Viernes";    break;  
            case 6:         nombreDia="Sábado";     break;  
            case 7:         nombreDia="Dominogo";   break;        
        }

        //Obtenemos el nombre del mes
        // if(mes==1)      nombreMes="Enero";
        // if(mes==2)      nombreMes="Febrero";
        // if(mes==3)      nombreMes="Marzo";
        // if(mes==4)      nombreMes="Abril";
        // if(mes==5)      nombreMes="Mayo";
        // if(mes==6)      nombreMes="Junio";
        // if(mes==7)      nombreMes="Julio";
        // if(mes==8)      nombreMes="Agosto";
        // if(mes==9)      nombreMes="Septiembre";
        // if(mes==10)     nombreMes="Octubre";
        // if(mes==11)     nombreMes="Noviembre";
        // if(mes==12)     nombreMes="Diciembre";

        switch(mes){
            case 1: nombreMes="Enero";      break;
            case 2: nombreMes="Febrero";    break;
            case 3: nombreMes="Marzo";      break;
            case 4: nombreMes="Abril";      break;
            case 5: nombreMes="Mayo";       break;
            case 6: nombreMes="Junio";      break;
            case 7: nombreMes="Julio";      break;
            case 8: nombreMes="Agosto";     break;
            case 9: nombreMes="Septiembre"; break;
            case 10: nombreMes="Octubre";   break;
            case 11: nombreMes="Noviembre"; break;
            case 12: nombreMes="Diciembre"; break;
        }

        //Imprimimos la salida final
        System.out.println(AnsiConsole.GREEN);
        System.out.println("Hoy es "+nombreDia+" "+dia+" de "+nombreMes+" de "+anio+" "+
                            hora+":"+minuto+" hs.");
        System.out.println(ubicacion);
        System.out.println(AnsiConsole.GREEN);
    }
}
