/*
Código educacional para demostrar llamado a funciones sin retorno de valor usando POO
 */
package funcionnoretorna;

/**
 *
 * @author davidmramirez
 */
public class FuncionNoretorna {

  
    public static void main(String[] args) {
        /*
        declaramos variable obj (es una instancia) para la función 
        nombre de la clase + nombre de una instancia (en este caso "obj") 
        y se inicializa con new
        */
        FuncionNoretorna obj = new FuncionNoretorna();
        
        //llamado de la función desde la instancia obj
        obj.funcion();
    }
    
    public void funcion(){
        System.out.println("Hola Mundo desde función afuera del main");
    }
    
}
