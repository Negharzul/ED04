/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antonio.git;

/**
 *
 * @author anton
 */
public class AntonioGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro un array de integers y lo muestro por consola con un método.
        //cambie valores del array de manera que RAMA1 tendra codigo diferente en la misma linea.
        int[] m=new int[]{-2,0,10,12,7,-3};
        
        ImprimirArray(m);
        
    }
    
    public static void ImprimirArray(int[] m){
        for (int i=0;i<m.length;i++) System.out.println(m[i]);
    }
}
