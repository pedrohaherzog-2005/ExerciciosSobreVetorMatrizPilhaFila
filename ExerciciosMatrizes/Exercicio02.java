package ExerciciosMatrizes;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] maimen = new int[3][3];

        System.out.println("\nDigite os valores iniciais para a matriz 3x3:");
        int tamanho = maimen.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < maimen[i].length; j++) {
                System.out.println("Elemento da ["+ i +"]["+ j +"]: ");
                maimen[i][j] = leitor.nextInt();
            }
        }

        int Maior = maimen[0][0];
        int Menor = maimen[0][0];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < maimen[i].length; j++) {
                if (maimen[i][j] > Maior) {
                    Maior = maimen[i][j];
                }
                if (maimen[i][j] < Menor) {
                    Menor = maimen[i][j];
                }
            }
        }
        System.out.println("\nMensagem do resultado no console:");
        System.out.println("O maior elemento da matriz é o: "+ Maior +". E o menor elemento da matriz é o: "+ Menor +".");
        leitor.close();
    }
}