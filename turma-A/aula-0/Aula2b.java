import java.util.Scanner;

public class Aula2b {
    public static void main(String[] args) {
        // while

        /*int cont = 0;

        while(cont < 5){
            System.out.println("Oi!!");
            cont++;
        }*/ 



       /* int soma = 0;
        int cont = 1;

        while(cont < 101){
            soma += cont;
            cont++;
           // System.out.println("Soma atual: " + soma);
        }

        System.out.println("Soma final: " + soma);*/




        /*int senhaC = 26;
        int senhaU;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        senhaU = entrada.nextInt();

        if(senhaU == senhaC){
            System.out.println("Senha correta!");
        }

        while(senhaU != senhaC){
            System.out.println("Senha invalida!" + "\nDigite novamente: ");
            senhaU = entrada.nextInt();
            senhaC = senhaU;
            System.out.println("Senha correta!");
        }*/ 


        int numero;

        System.out.println("--TABUADA--");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        
        System.out.println("\nTabuada do " + numero + ":");

        for(int i=0; i<=10;i++){
            int tabuada = numero*i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }

        




        

        







    }
    
}
