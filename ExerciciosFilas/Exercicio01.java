package ExerciciosFilas;
import java.util.Queue;
import java.util.LinkedList;

public class Exercicio01 {
    public static void main(String[] args) {
        Queue<Integer> fila01 = new LinkedList<>();

        fila01.add(5);
        fila01.add(10);
        fila01.remove();
        fila01.add(15);
        fila01.remove();
        fila01.add(20);
        fila01.add(25);
        fila01.remove();

        int tamanho = fila01.size();
        System.out.println("Quantidade de elementos da fila: " + tamanho + " elementos;");
    }
}