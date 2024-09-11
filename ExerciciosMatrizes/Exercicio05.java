package ExerciciosMatrizes;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Matriz Original: ");
        int tamanho = original.length;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(original[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\n==============================================");
        
        int[] copia = new int[tamanho];
        for (int c = 0; c < tamanho; c++) {
            copia[c] = original[c];
        }
            
        System.out.print("\nMatriz Copiada: ");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }
        leitor.close();
    }
}