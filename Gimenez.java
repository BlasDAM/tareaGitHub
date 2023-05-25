
package com.mycompany.lopezgimenez;

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
}
