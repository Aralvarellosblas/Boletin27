package ejercicio27;

import static ejercicio27.Calculadora.cad;

/**
 *
 * @author Arturo
 */
public class Metodos {
    public static String arrayString(){
        String num="";
        for(int i=0; i<cad.size(); i++){
            num=num+cad.get(i);
        }
        return num;
    }
    
}
