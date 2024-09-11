package ExerciciosPilhas;
import java.util.Stack;

public class Exercicio02 {
    public static void main(String[] args) {
        Stack<Integer> pilha02 = new Stack<>();

        pilha02.push(5);
        pilha02.push(10);
        pilha02.push(15);
        pilha02.pop();
        pilha02.push(20);
        pilha02.pop();
        pilha02.push(25);
        pilha02.push(30);
        pilha02.pop();
        pilha02.push(35);

        int tamanho = pilha02.size();
        int topo = pilha02.peek();
        System.out.println("\nO elemento do topo da pilha: " + topo);
        System.out.println("Quantidade de elementos na pilha: "+ tamanho +"\n");
    }
}