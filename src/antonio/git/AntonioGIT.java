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
        //modifico los valores del array para que exista codigo diferente en la misma linea y así provocar un conflicto.
        //Declaro un array de integers y lo muestro por consola con un método.
        int[] m=new int[]{-2,0,-20,15,7,-3};
        
        imprimirArray(m);
        
        //Imprimo la suma de todos los valores del array.
        System.out.println(sumaArray(m));
        
        //imprimo la suma de 2 valores obtenidos aleatoriamente dentro del array.
        System.out.println(aleatorioArray(m)+aleatorioArray(m));
        
    }
    
    public static void imprimirArray(int[] m){
        for (int i=0;i<m.length;i++) System.out.println(m[i]);
    }
    
    public static int sumaArray(int[] m){
        int total=0;
        for (int i=0;i<m.length;i++){
            total+=m[i];
        }
        return total;
    }
    
    public static int aleatorioArray(int[] m){
        return m[(int)(Math.random()*m.length)];  
    }
}
