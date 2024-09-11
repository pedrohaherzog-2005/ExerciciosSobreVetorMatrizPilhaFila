package ExerciciosVetores;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] media = new int[10];

        System.out.println("Digite todos os elementos do vetor:");
        int tamanho = media.length;
        for (int t = 0; t < tamanho; t++) {
            System.out.println("\nÍndice " + (t + 1) + ":");
            media[t] = leitor.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += media[i];
        }

        int CalcMedia = soma / 5;
        System.out.println("A média dos elementos do vetor é: " + CalcMedia);
        leitor.close();
    }
}