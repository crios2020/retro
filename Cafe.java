
public class Cafe {
    public static void main(String[] args) {
        System.out.println(getCafe());
    }
    public static String getCafe(){
        String nombre=System.getProperty("java.vm.name");
        String version=System.getProperty("java.version");
        String fecha=System.getProperty("java.version.date");
        return nombre+" - "+version+" - "+fecha;
    }
}
