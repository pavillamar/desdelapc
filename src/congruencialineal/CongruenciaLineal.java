/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencialineal;

/**
 *
 * @author Usuario
 */

 

public class CongruenciaLineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //parámetros generador congruencial lineal 
double X0 = 1;//semilla 
        double X; // número pseudoaleatorio 
        double A = 8;//multiplicador 
        double B = 5;//incremento 
        double C = 200000;//modulo 
        double r; // número pseudoaletorio (0,1) //parámetros distribución uniforme 
        double a = 6;//limite superior 
        double b = 8;// limite inferior 
        double unif;// número aleatorio distribución uniforme 
        double n = 50;// cantidad de números generados 
        X = X0;
        for (int i = 0; i < n; i++) {
            X = ((A * X + B) % C); //número pseudoaleatorio 
            r = X / (C - 1); // número pseudoaleatorio (0,1) 
            unif = r * (b - a) + a;
            int h=0;
            System.out.println(i);
        }
    }

}
