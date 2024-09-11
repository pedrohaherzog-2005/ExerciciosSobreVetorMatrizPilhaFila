package ExerciciosVetores;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] trocado = new int[10];

        System.out.println("Digite todos os elementos do vetor:");
        int tamanho = trocado.length;
        for (int t = 0; t < tamanho; t++) {
            System.out.println("\nÍndice " + (t + 1) + ":");
            trocado[t] = leitor.nextInt();
        }

        System.out.println("\nVetor antes da troca:");
        for (int ian = 0; ian < tamanho; ian++) {
            System.out.println("\nÍndice " + (ian + 1) + ": " + trocado[ian]);
        }

        int valorTroca = trocado[5];
        System.out.println("\nDigite o novo valor para substituir o número " + valorTroca + ":");
        int novoValor = leitor.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (trocado[i] == valorTroca) {
                trocado[i] = novoValor;
            }
        }

        System.out.println("\nVetor após a troca:");
        for (int ids = 0; ids < tamanho; ids++) {
            System.out.println("\nÍndice " + (ids + 1) + ": " + trocado[ids]);
        }
        leitor.close();
    }
}

/* {1, 2, 3, 4, 5, 3, 7} */