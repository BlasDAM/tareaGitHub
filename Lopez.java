
package com.mycompany.lopezgimenez;

/**
 *
 * @author BLAS
 */
public class Lopez {
    
    public void nombreLopez(){
     System.out.println("Clase lopez");
    }
    
      public static boolean esMultiplo(int numero, int multiplo) {
        if (multiplo % numero == 0) {
            return true;
        }
        return false;
    }
      
       public static void numeroAleatorio() {
        int aleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("El numero aleatorio es " + aleatorio);
        
    }
}
