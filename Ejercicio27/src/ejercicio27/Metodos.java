package ejercicio27;


/**
 *
 * @author Arturo
 */
public class Metodos {
    public static String arrayString(){
        String num="";
        for(int i=0; i<Calculadora.cad.size(); i++){
            num=num+Calculadora.cad.get(i);
        }
        return num;
    }
    
}
