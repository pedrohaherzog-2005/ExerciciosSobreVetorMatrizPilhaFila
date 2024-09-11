package ExerciciosMatrizes;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] poi = new int[5][5];

        System.out.println("\nDigite os valores iniciais para a matriz 5x5:");
        int tamanho = poi.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < poi[i].length; j++) {
                System.out.println("Elemento da ["+ i +"]["+ j +"]:");
                poi[i][j] = leitor.nextInt();
            }
        }

        System.out.print("\n==============================================\n");

        int Par = poi[0][0];
        int Impar = poi[0][0];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < poi[i].length; j++) {
                if (poi[i][j] % 2 == 0) {
                    Par++;
                }
                else {
                    Impar++;
                }
            }
        }
        System.out.println("Mensagem do resultado no console:");
        System.out.println("A quantidade de elementos pares é: "+ Par +". E a quantidade de elementos ímpares é: "+ Impar +"." + "\n");
        leitor.close();
    }
}