package ExerciciosFilas;
import java.util.Queue;
import java.util.LinkedList;

public class Exercicio03 {
    public static void main(String[] args) {
        Queue<Integer> fila03 = new LinkedList<>();

        int removido = 0;
        fila03.add(7);
        fila03.add(14);
        fila03.add(21);
        removido = fila03.remove();
        fila03.add(28);
        fila03.add(35);
        removido = fila03.remove();
        fila03.add(42);
        removido = fila03.remove();
        fila03.add(49);
        removido = fila03.remove();

        int tamanho = fila03.size();
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Tamanho da fila: " + fila03 + " elementos;");
        }
        System.out.println("Elemento removido: " + removido);
    }
}