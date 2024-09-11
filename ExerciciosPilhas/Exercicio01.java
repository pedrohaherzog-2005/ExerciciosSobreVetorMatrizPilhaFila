package ExerciciosPilhas;
import java.util.Stack;

public class Exercicio01 {
    public static void main(String[] args) {
        Stack<Integer> pilha01 = new Stack<>();

        pilha01.push(10);
        pilha01.push(20);
        pilha01.pop();
        pilha01.push(30);
        pilha01.pop();
        pilha01.push(40);
        pilha01.push(50);
        pilha01.pop();

        int topo = pilha01.peek();
        System.out.println("\nO elemento do topo da pilha: " + topo);
        int tamanho = pilha01.size();
        System.out.println("Quantidade de elementos na pilha: "+ tamanho +"\n");
    }
}