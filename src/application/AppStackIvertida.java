package application;
import java.util.Stack;

public class AppStackIvertida {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        System.out.println("Inversão da String");
        stack.push("ESTE");
        stack.push("EXERCÍCIO");
        stack.push("É");
        stack.push("MUITO");
        stack.push("FÁCIL");
        
        System.out.println("String antes da inversão: " + String.join(" ", stack));
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        sb.reverse();
        System.out.println("String invertida: " + sb.toString());
    }

}