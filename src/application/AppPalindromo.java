package application;
import java.util.Stack;

public class AppPalindromo {
    public static void main(String[] args) {
        String palavra = "arara";
        String segundaPalavra = "ovo";
        String terceiraPalavra = "peixe";
        System.out.println("A palavra '" + palavra + "' é um palíndromo? " + Palindromo(palavra));
        System.out.println("A palavra '" + segundaPalavra + "' é um palíndromo? " + Palindromo(segundaPalavra));
        System.out.println("A palavra '" + terceiraPalavra + "' é um palíndromo? " + Palindromo(terceiraPalavra));
    }

    public static boolean Palindromo(String palavra) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            stack.push(palavra.charAt(i));
        }
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

}
