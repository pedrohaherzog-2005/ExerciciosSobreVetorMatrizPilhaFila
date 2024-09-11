package ExerciciosFilas;
import java.util.Queue;
import java.util.LinkedList;

public class Exercicio02 {
    public static void main(String[] args) {
        Queue<Integer> fila02 = new LinkedList<>();

        int removido = 0;
        fila02.add(3);
        fila02.add(6);
        fila02.add(9);
        removido = fila02.remove();
        fila02.add(12);
        fila02.add(15);
        removido = fila02.remove();
        fila02.add(18);
        removido = fila02.remove();
        System.out.println("Elemento removido: " + removido);
    }
}