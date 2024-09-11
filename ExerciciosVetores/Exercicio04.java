package ExerciciosVetores;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] poi = new int[10];

        System.out.println("Digite todos os elementos do vetor:");
        int tamanho = poi.length;
        for (int t = 0; t < tamanho; t++) {
            System.out.println("\nÍndice " + (t + 1) + ":");
            poi[t] = leitor.nextInt();
        }
        
        int[] pares = new int[tamanho]; 
        int[] impares = new int[tamanho];
        int CalcPares = 0, CalcImpares = 0;
        for (int i = 0; i < tamanho; i++) {
            if (poi[i] % 2 == 0) {
                pares[CalcPares++] = poi[i];
            } else {
                impares[CalcImpares++] = poi[i];
            }
        }
        System.out.println("\nQuantidade de números pares: " + CalcPares);
        System.out.print("Lista:" + "\n");
        for (int i = 0; i < CalcPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nQuantidade de números ímpares: " + CalcImpares);
        System.out.print("Lista:" + "\n");
        for (int i = 0; i < CalcImpares; i++) {
            System.out.println(impares[i] + " ");
        }
        leitor.close();
    }
}