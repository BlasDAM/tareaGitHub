
package com.mycompany.lopezgimenez;

import java.util.Scanner;

/**
 *
 * @author BLAS
 */
public class Gimenez {
 public void nombreGimenez(){
     System.out.println("Clase gimenez");
    }
 
  public static int aleatorioEntreDosNumeros(int numeroA1, int numeroA2) {

        int aleatorio = (int) (Math.random() * (numeroA1 - numeroA2) + numeroA2);
        return aleatorio;
    }
  
   public static double precioConIva( double num){
        double Iva = num * 0.21;
        double precioTotal = num + Iva;

        return precioTotal;
    }
  public static int leeNumero() {
        Scanner lee = new Scanner(System.in);
        int numeroLeido = lee.nextInt();
        return numeroLeido;
    }
  
   public static int mayorDeTresNumeros(int primerN, int segundoN, int tercerN) {

        int numeroMayor;
        if ((primerN > segundoN) && (primerN > tercerN)) {
            numeroMayor = primerN;
        } else if ((segundoN > primerN) && (segundoN > tercerN)) {
            numeroMayor = segundoN;

        } else {
            numeroMayor = tercerN;
        }
        return numeroMayor;
    }

}
