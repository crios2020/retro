public class Matrix {
    public static void main(String[] args) {
        System.out.println(AnsiConsole.GREEN);
        for(int a=0;a<=2000000;a++){
            System.out.print(((Math.random()*100)>=50)?"1":"0");
        }
        System.out.println(AnsiConsole.RESET);
    }
}
