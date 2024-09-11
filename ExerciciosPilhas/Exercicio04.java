package ExerciciosPilhas;
import java.util.Stack;

public class Exercicio04 {
    public static void main(String[] args) {
        Stack<Integer> pilha04 = new Stack<>();

        pilha04.push(3);
        pilha04.push(6);
        pilha04.push(9);
        pilha04.pop();
        pilha04.push(12);
        pilha04.pop();
        pilha04.push(15);
        pilha04.pop();
        pilha04.push(18);
        pilha04.pop();
        pilha04.push(21);
        pilha04.pop();

        int tamanho = pilha04.size();
        System.out.println("\nQuantidade de elementos na pilha: " + tamanho);
        int topo = pilha04.peek();
        System.out.println("O elemento do topo da pilha: " + topo);
    }
}