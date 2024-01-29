/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Lc
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp ;
        Scanner leitura = new Scanner(System.in); 
        do{
            System.out.print("Digite um Número: ");
            n = leitura.nextInt();
            s += n; 
            System.out.println("Quer continuar? [S/N]");
            resp = leitura.next();
        }
        while(resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
