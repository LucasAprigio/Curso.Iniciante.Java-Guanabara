package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        //CONDIÇÃO COMPOSTA
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int ano = leitura.nextInt();
        int idade = 2024 - ano;
        System.out.print("Você tem "+ idade);
        if(idade > 18){
            System.out.println(" e é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }
    
}
