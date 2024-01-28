package operadoresaritimeticos;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        /*
        -- OPERADORES PADRÃO -- 
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) /2;
        System.out.println("A média é igual a " + m);
        
        -- OPERADORES UNÁRIOS --
        int numero = 20;
        int valor = 7 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        
        
        -- OPERADORES DE ATRIBUIÇÃO -- 
        int x = 4;
          x += 2; // X = X + 2  
          x -= 2; // X = X - 2 
          x *= 2; // X = X * 2 
          x /= 2; // X = X / 2 
          x %= 2; // X = X % 2 
        System.out.println(x);
        
        -- ARREDONDAMENTO -- 
        //Arredondamento para CIMA
        float v = 8.9f;
        int ar = (int)Math.floor(v);
        System.out.println(ar);
        
        //Arredondamento para BAIXO
        float v = 8.9f;
        int ar = (int)Math.ceil(v);
        System.out.println(ar);
        
        //Arredondamento Aritimético
        float v = 8.9f;
        int ar = (int)Math.round(v);
        System.out.println(ar); 
        
       //Arrendondamento ABSOLUTO
        float v = 8.9f;
        int ar = (int)Math.abs(v);
        System.out.println(ar);
        
        -- GERADOR DE NÚMEROS --
        //Gera número entre 0 e 1
        double ale = Math.random();
        System.out.println(ale);*/
        
        //GERADOR DE UM NÚMERO(0) ATÉ OUTR0 (15)
        double ale = Math.random();
        int n = (int) (0 + ale*(15-0));
        System.out.println(n);
    }
    
}
