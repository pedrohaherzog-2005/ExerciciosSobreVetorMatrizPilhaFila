package ExerciciosFilas;
import java.util.Queue;
import java.util.LinkedList;

public class Exercicio04 {
    public static void main(String[] args) {
        Queue<Integer> fila04 = new LinkedList<>();

        fila04.add(4);
        fila04.add(8);
        fila04.add(12);
        fila04.remove();
        fila04.add(16);
        fila04.remove();
        fila04.add(20);
        fila04.remove();
        fila04.add(24);
        fila04.remove();

        int tamanho = fila04.size();
        System.out.println("Tamanho da fila: " + tamanho + " elementos;");
        int ultimo = 0;
        for (Integer valor : fila04) {
            ultimo = valor;
        }
        System.out.println("Último elemento: " + ultimo);
    }
}