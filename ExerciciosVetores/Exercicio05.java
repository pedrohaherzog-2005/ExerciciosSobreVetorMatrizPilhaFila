package ExerciciosVetores;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetorUm = new String[5];

        System.out.println("ATENÇÃO: COLOQUE PALAVRAS SEM ASSENTO!!!");
        System.out.println("Digite todos os elementos do tipo texto no vetorUm:");
        int tamanho = vetorUm.length;
        for (int t = 0; t < tamanho; t++) {
            System.out.println("\nÍndice " + (t + 1) + ":");
            vetorUm[t] = leitor.nextLine();
        }

        System.out.println("\nElementos copiados do vetorUm, no vetorDois:");
        String[] vetorDois = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDois[i] = vetorUm[i];
            System.out.println("\n" + vetorDois[i] + ";");
        }
        leitor.close();
    }
}

/* "Cerejeira", "Carvalho", "Seringueira", "Cedro", "Jaqueira" */