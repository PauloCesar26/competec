import java.util.Scanner;

public class Treino {
   public static void main(String[] args) {
        /*int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();

        System.out.println("\nNúmero recebido em segundos: " + num);

        int horas = num / 3600;
        int segundosRestantes = num % 3600;

        int minutos = segundosRestantes / 60;
        int segundosFinais = segundosRestantes % 60;

        System.out.println("Segundo convertido para horas, minutos e segundos:");
        System.out.println(horas +":"+minutos+":"+segundosFinais);

        entrada.close();*/


        // Treino Array
        // int num[] = {1,2,3};
        // int soma = num[1] + num[0] + num[2];
        // System.out.println(soma);


        // int valor[] = {7,7,7};
        // for(int i=0; i < valor.length; i++){
        //     System.out.print(valor[i]);
        // }


        int num[] = {3,7,1};
        if(num[0] < num[1] && num[0] < num[2]){
            System.out.println("Menor valor: " + num[0]);
        }
        else if(num[1] < num[0] && num[1] < num[2]){
            System.out.println("Menor valor: " + num[1]);
        }
        else if(num[2] < num[0] && num[2] < num[1]){
            System.out.println("Menor valor: " + num[2]);
        }
        if(num[0] > num[1] && num[0] > num[2]){
            System.out.println("Maior valor: " + num[0]);
        }
        else if(num[1] > num[0] && num[1] > num[2]){
            System.out.println("Maior valor: " + num[1]);
        }
        else if(num[2] > num[0] && num[2] > num[1]){
            System.out.println("Maior valor: " + num[2]);
        }






       
    }
}  

