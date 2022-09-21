
public class Sistema {
    public static void main(String[] args) {
        System.out.println(getSistema());
    }
    
    public static String getSistema(){
        String sistema=System.getProperty("os.name");
        String version=System.getProperty("os.version");
        String arch=System.getProperty("os.arch");
        return sistema+" "+version+" "+arch;
    }

}
