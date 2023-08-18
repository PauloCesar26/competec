import java.util.Scanner;

public class pokemon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do Array: ");
        int tamanho = sc.nextInt();
        String nomes [] = new String[tamanho]; 

        System.out.println("________________________________________");

        for(int i=0; i < nomes.length; i++){
            System.out.print("\nDigite os nomes do pokemon: ");
            nomes[i] = sc.next();
        }
        System.out.println("________________________________________");
       for(int i=0; i< nomes.length; i++){
        for(int j=i+1; j < nomes.length; j++){
            if(nomes[i]).compareToIgnoreCase(nomes[j] > 0){
                String temp = nomes[i];
                nomes[i] = nomes[j];
                nomes
            }

        }

       }
        

    }
}