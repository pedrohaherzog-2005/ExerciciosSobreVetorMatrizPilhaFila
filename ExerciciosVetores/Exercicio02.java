package ExerciciosVetores;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vm = new int[10];

        System.out.println("Digite todos os elementos do vetor:");
        int tamanho = vm.length;
        for (int t = 0; t < tamanho; t++) {
            System.out.println("\nÍndice " + (t + 1) + ":");
            vm[t] = leitor.nextInt();
        }

        int maior = vm[0];
        int menor = vm[0];
        for (int i = 0; i < tamanho; i++) {
            if (vm[i] > maior) {
                maior = vm[i];
            }
            else if (vm[i] < menor) {
                menor = vm[i];
            }
        }
        System.out.println("\nO maior elemento do vetor é " + maior + ", e o menor elemento é " + menor + ";");
        leitor.close();
    }
}