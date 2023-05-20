import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {

        int ddd;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("DDD 11 ou DDD 21" + "\nDigite o DDD para aparecer a cidade: ");
        ddd = entrada.nextInt();

        if(ddd == 11){
           System.out.println("São Paulo" + "\nEntrada: " + ddd + "\nTerra da garoa"); 
        }
        else if(ddd == 21){
            System.out.println("Rio de Janeiro" + "\nEntrada: " + ddd + "\nCopacabana");
        }
        else{
            System.out.println("Digite o DDD certo!!");
        }
        

    }
    
}