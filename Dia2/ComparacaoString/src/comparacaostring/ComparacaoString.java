
package comparacaostring;

public class ComparacaoString {


    public static void main(String[] args) {
       
       String nome1 = "Lucas";
       String nome2 = "Lucas";
       String nome3 = new String("Lucas");
       String res;
       res = (nome1.equals(nome3)) ? "São iguais":"São diferentes";
       System.out.println(res);

    }
    
}
