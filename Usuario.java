
public class Usuario {
    public static void main(String[] args) {
        System.out.println(getUsuario());
    }
    public static String getUsuario(){
        String nombre=System.getProperty("user.name");
        String lenguaje=System.getProperty("user.language");
        String home=System.getProperty("user.home");
        return nombre+" - "+lenguaje+" - "+home;
    }
}
