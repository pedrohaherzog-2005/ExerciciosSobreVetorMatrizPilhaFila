package ExerciciosVetores;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vs = new int[10];

        System.out.println("Digite todos os elementos do vetor:");
        int tamanho = vs.length;
        for (int t = 0; t < tamanho; t++) {
            System.out.println("\nÍndice " + (t + 1) + ":");
            vs[t] = leitor.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vs[i];
        }
        System.out.println("\nA soma dos elementos do vetor é:" + soma);
        leitor.close();
    }
}