
package com.mycompany.lopezgimenez;

import java.util.Scanner;

/**
 *
 * @author BLAS
 */
public class Lopez {
    
    public void nombreLopez(){
     System.out.println("Clase lopez");
    }
      public static String leeLetra(){
          Scanner lee = new Scanner(System.in);
          String letraLeida= lee.next();
          return letraLeida;
    }
      
       public static double leeNumeroConDecimales() {
        Scanner lee = new Scanner(System.in);
        double numeroLeido = lee.nextDouble();
        return numeroLeido;
    }
}
