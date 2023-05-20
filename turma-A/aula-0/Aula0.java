import java.util.Scanner;

public class Aula0{
    public static void main(String[] args){
      /*char[] nome = {'B','O','S','S'}; 
       System.out.println("Nome: " + nome);
       int idade = 16;
       System.out.println("idade: " + idade);
       boolean cafe = true;
    System.out.println("Little BOSS");*/
    
    /*int idade = 16;
    String nome = "Paulo";
    System.out.println("Nome: "+ nome +  "\nIdade = " + idade);*/
    
    /*int n1 = 10;
    int n2 = 5;
    double resultado = n1 / n2;
    System.out.println(resultado);*/ 

    /*double laranja = 3.55;
    double uva = 2.25;
    double valorFinal = laranja + uva;
    System.out.println("Valor da laranja: " + laranja + "\nValor da uva: " + uva + "\nSoma dos valores: " + valorFinal);*/

   /*  Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um nome: ");
    String nome = entrada.nextLine();
    System.out.println("Nome recebido: " + nome);

    entrada.close();*/

    Scanner entrada = new Scanner(System.in);
    System.out.print("Qual o seu nome? ");
    String nome = entrada.nextLine();

    
    System.out.print("Qual a sua idade? ");
    int idade = entrada.nextInt();
    System.out.println("Idade recebida: " + idade + "\nNome recebido: " + nome);



    }
}