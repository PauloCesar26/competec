import java.util.Scanner;

public class Matrizes {
    public static void main(String []args){
        /*int tabela [][] = {{4,6},{1, 7}};

        for(int i=0; i < tabela.length ; i++){
            for(int p=0; p < tabela.length ; p++){
                System.out.print(tabela[i][p] + " ");
            }

        }
    }*/

        Scanner sc = new Scanner(System.in);
        int  tabela [][] = new int[3][3];

        for(int i=0; i < 3 ; i++){
            for(int p=0; p < 3 ; p++){
                System.out.println("Jogadas: ");
                tabela[i][p] = sc.nextInt();
            
            }
        System.out.println(" ");
        }
    }


    
    
}
