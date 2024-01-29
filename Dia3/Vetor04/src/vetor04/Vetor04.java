/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Lc
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int vet[]= {3 ,7 ,4 ,1 ,9, 2};
         for(int v:vet){
             System.out.print(v + " ");
         }
         System.out.println("");
         int p = Arrays.binarySearch(vet, 7);
         System.out.println("Encontrei o valor na posição " + p);
    }
    
}
