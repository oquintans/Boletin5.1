package ejercicio5.pkg1;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coche parida1=new Coche();
       System.out.println("Velocidad: "+parida1.getVelocidade());
       parida1.acelerar(50);
       System.out.println("Velocidad acelerada: "+parida1.getVelocidade());
       parida1.frenar(20);
       System.out.println("Velocidad frenada: "+parida1.getVelocidade());
        
    }
    
}
