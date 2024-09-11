package ExerciciosMatrizes;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] media = new int[3][3];
        int soma = 0;
        int calcMedia = 0;
        int elementos = 0;

        System.out.println("\nDigite os valores iniciais para a matriz 3x3:");
        int tamanho = media.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < media[i].length; j++) {
                System.out.println("Elemento da ["+ i +"]["+ j +"]:");
                media[i][j] = leitor.nextInt();
                soma = media[i][j];
                elementos++;
            }
        }
        System.out.println("\nResultados da soma e da média:");
        System.out.println("A soma de todos os elementos da matriz é: " + soma + ";");

        calcMedia = soma / elementos;
        System.out.println("\nA soma de todos os elementos da matriz é: " + calcMedia + ";" + "\n");
        leitor.close();
    }
}