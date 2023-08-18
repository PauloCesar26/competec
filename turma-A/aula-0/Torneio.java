
import java.util.Arrays;
import java.util.Scanner;

public class Torneio{
   public static void main(String[] args) {
 

/*public static void main(String[] args) {
     int ddd;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o DDD para aparecer a cidade: ");
        ddd = entrada.nextInt();

        if(ddd == 61){
           System.out.println("Brasilia"); 
        }
        else if(ddd == 71){
            System.out.println("Salvador");
        }
        else if(ddd == 11){
            System.out.println("São Paulo");
        }
        else if(ddd == 21){
            System.out.println("Rio de Janeiro");
        }
        else if(ddd == 32){
            System.out.println("Juiz de fora");
        }
        else if(ddd == 19){
            System.out.println("Campinas");
        }
        else if(ddd == 27){
            System.out.println("Vitoria");
        }
        else if(ddd == 31){
            System.out.println("Belo horizonte");
        }

        else{
            System.out.println("DDD não está cadastrado.");
        }
        

    }*/
    
       
        

    



        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três valores: ");
        // Leitura dos valores
        int[] valores = new int[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = sc.nextInt();
        }

        // Ordenação em ordem crescente
        int[] valoresOrdenados = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valoresOrdenados);
        System.out.println();
        // Impressão dos valores ordenados
        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }

        // Impressão de uma linha em branco
        System.out.println();

        // Impressão dos valores na sequência original
       /* for (int valor : valores) {
            System.out.println(valor);
        }*/
        sc.close();
    }
}


       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    





        




        
