import java.util.Scanner;

public class Array {
     public static void main(String[] args) {

       /*for(int i = 10; i <= 1000; i++){
            if(i % 10 == 0){
                System.out.println(i);
            }
        }*/


        /*int num [] = {1, 2, 3};
        int soma = num[0] + num[2];
        System.out.println(soma);*/


        /*Scanner sc = new Scanner(System.in);
        int valores [] = new int [5];
        for(int i=0; i < valores.length; i++){
            valores[i] = sc.nextInt();
        }*/



        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho:");
        int tamanho = sc.nextInt();
        int valores [] = new int[tamanho]; 

        System.out.println("________________________________________");

        for(int i=0; i < valores.length; i++){
            System.out.print("\nDigite os valores:");
            valores[i] = sc.nextInt();
        }
        System.out.println("________________________________________");
        for(int i=0; i < valores.length; i++){
            System.out.println("\nValor: " + valores[i] + " esta na posição " + i);
        }

         System.out.println("________________________________________");

        int mult = 1;
        for(int i = 0; i < valores.length; i++){
            mult *= valores[i]; 
        }
        System.out.println("\nMultipicação entre os valores do vetor: " + mult); 

        System.out.println("________________________________________");

        double media = 0;
        for(int i=0; i < valores.length; i++){
            media += valores[i];
        }
        media = media / valores.length;
        System.out.println("\nMedia doa valores do vetor: " + media); 
        System.out.println("________________________________________");
        
        //int multi = valores[0] * valores[2];
        //System.out.println("Multiplicação dos números no vetor" + multi);
        //int media = valores[0] + valores[2] / 4;
        //System.out.println("Media: " + media);

    
}
}