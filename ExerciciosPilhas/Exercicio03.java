package ExerciciosPilhas;
import java.util.Stack;

public class Exercicio03 {
    public static void main(String[] args) {
        Stack<Integer> pilha03 = new Stack<>();

        pilha03.push(7);
        pilha03.push(14);
        pilha03.push(21);
        pilha03.pop();
        pilha03.push(28);
        pilha03.pop();
        pilha03.push(35);
        pilha03.pop();
        pilha03.push(42);
        pilha03.pop();

        int tamanho = pilha03.size();
        System.out.println("\nQuantidade de elementos na pilha: " + tamanho);
        int topo = pilha03.peek();
        int fundo = (pilha03.peek() / pilha03.size());
        System.out.println("O elemento do topo da pilha: " + topo);
        System.out.println("O elemento do fundo da pilha: " + fundo + "\n");
    }
}