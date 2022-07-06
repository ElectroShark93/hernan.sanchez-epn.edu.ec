package utilitario;
import java.io.IOException;

public class ProgressBar {

    /**
     * [oooo/        ] 30%   Loading: 8 de 25    hernan.s
     * @param Nombre : Palabra a imprimir al 100%
     * @param c : caracter a dibujar
     */
    public static void showProgressBar_e(String nombre,String c) throws IOException, InterruptedException{
        int TamBar = 30;
        String sb = new String();
        for (int i = 0; i <= nombre.length(); i++) {
        for (int procentaje = 0; procentaje <= 100; procentaje++) {
                procentaje+=4;            
                int nroCaracteres = procentaje * TamBar / 100;  //numero de caracteres
                sb =  "\r [";
                for (int k = 0; k <= TamBar; k++){
                    sb += String.format("%s", ((nroCaracteres < k) ? " " : c.charAt(procentaje % c.length()))  );
                }
                sb += "]";
                
                System.out.write(sb.getBytes());
                System.out.printf(" %d %%", procentaje,nombre.length());
                System.out.println("\t Loading: " + i + " de 25 \t " + nombre.charAt(i++) );
            }
            
            Thread.sleep(1000);
            
        }
        
        
        
    }
    
}
