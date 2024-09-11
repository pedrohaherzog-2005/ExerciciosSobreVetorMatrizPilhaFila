package ExerciciosMatrizes;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] substituido = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Matriz Original: ");
        int tamanho = substituido.length;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(substituido[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("\nDigite o valor a ser substituído: ");
        int valorAntigo = leitor.nextInt();
        System.out.print("\nDigite o novo valor: ");
        int novoValor = leitor.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (substituido[i] == valorAntigo) {
                substituido[i] = novoValor;
            }
        }

        System.out.print("\nMatriz modificada: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(substituido[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        leitor.close();
    }
}