import utilitario.ProgressBar;

public class App {
    public static void main(String[] args) throws Exception, InterruptedException {
        /**
         * @author : Hernán Sánchez
         * @version: 1
         */
        
        String nombre = "hernan.sanchez@epn.edu.ec";
        System.out.println("\n");
        for (int i = 0; i <= nombre.length(); i++) {
            System.out.println(" \t"+i);
            ProgressBar.showProgressBar_e(nombre,"\\/-o");
        }
        
    }
}
