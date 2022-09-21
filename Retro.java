import java.util.concurrent.ConcurrentHashMap;

public class Retro {
    public static void main(String[] args) {
        while(true){
            System.out.println(AnsiConsole.BLUE_BOLD_BRIGHT);
            System.out.println("CENTRO DE FORMACIÓN PROFESIONAL Nro 35");
            Ahora.main(null);
            System.out.println(AnsiConsole.RED);
            System.out.println("Sistema Operativo: "+Sistema.getSistema());
            System.out.println("Versión de Java: "+Cafe.getCafe());
            System.out.println("Usuario: "+Usuario.getUsuario());

            waiting();
            waiting();

            Arte1.main(null);
            waiting();

            Arte2.main(null);
            waiting();

            Arte3.main(null);
            waiting();

            Arte4.main(null);
            waiting();

            Arte5.main(null);
            waiting();

            Arte6.main(null);
            waiting();

            Arte7.main(null);
            waiting();

            Arte8.main(null);
            waiting();

            Arte9.main(null);
            waiting();

            Arte10.main(null);
            waiting();

            Arte11.main(null);
            waiting();

            Arte12.main(null);
            waiting();

            Arte13.main(null);
            waiting();

            Arte14.main(null);
            waiting();

            Arte15.main(null);
            waiting();

            Arte16.main(null);
            waiting();

            Arte17.main(null);
            waiting();

            Arte18.main(null);
            waiting();

            Arte19.main(null);
            waiting();

            Arte20.main(null);
            waiting();

            Arte21.main(null);
            waiting();

            Arte22.main(null);
            waiting();

            Arte23.main(null);
            waiting();

            Arte24.main(null);
            waiting();

            Matrix.main(null);
            waiting();
        }
    }

    public static void waiting(){
        try{ Thread.sleep(2000);}catch(Exception e){}
    }
}
