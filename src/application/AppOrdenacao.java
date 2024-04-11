package application;
import java.util.Collections;
import java.util.Stack;

public class AppOrdenacao {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(785);
        stack.push(1);
        stack.push(200);
        stack.push(999);
        stack.push(542);
        stack.push(27);

        ordenacao(stack);

        System.out.println("Números ordenados: " + stack);
        System.out.println("Maior número: " + maior(stack));
        System.out.println("Menor número: " + menor(stack));
        System.out.println("Média Aritmetica: " + media(stack));
    }

    public static void ordenacao(Stack<Integer> stack) {
        Collections.sort(stack);
    }

    public static int maior(Stack<Integer> stack) {
        return Collections.max(stack);
    }

    public static int menor(Stack<Integer> stack) {
        return Collections.min(stack);
    }

    public static int media(Stack<Integer> stack) {
        int soma = 0;
        for(int numeros : stack) {
            soma += numeros;
        }

        return soma / stack.size();
    }
}