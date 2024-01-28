
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
      
       //CONDIÇÃO SIMPLES
       Scanner leitura = new Scanner(System.in);
        
       System.out.print("Digite sua primeira nota: ");
       float n1 = leitura.nextFloat();
        System.out.print("Digitie  sua segunda nota: ");
       float n2 = leitura.nextFloat();
       float m = (n1+n2)/2;
       System.out.println("Sua media foi " +m);
       
        if(m >9){
            System.out.println("Parabéns seu futuro será brilhante");
        } 
        
        
    }
    
}
