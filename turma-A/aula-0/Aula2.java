import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {

        int n1;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n1 = entrada.nextInt();
        System.out.println("Número recebido: " + n1);

        if(n1 % 2 == 0){
            System.out.println("O número é par.");
        }
        else{
            System.out.println("O número é impar.");
        }
        

    }
    
}
