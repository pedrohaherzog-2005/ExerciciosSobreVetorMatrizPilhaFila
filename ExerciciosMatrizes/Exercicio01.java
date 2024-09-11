package ExerciciosMatrizes;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] soma = new int[3][3];
        int calcSoma = 0;

        System.out.println("\nDigite os valores iniciais para a matriz 3x3:");
        int tamanho = soma.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                System.out.println("Elemento da ["+ i +"]["+ j +"]:");
                soma[i][j] = leitor.nextInt();
                calcSoma += soma[i][j];
            }
        }
        System.out.println("\nMensagem do resultado da soma:");
        System.out.println("\nA soma de todos os elementos da matriz é: " + calcSoma + "\n");
        leitor.close();
    }
}