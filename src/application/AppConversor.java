package application;

import java.util.Scanner;

public class AppConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversão de Números");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("(a) Decimal para Binário.");
        System.out.println("(b) Decimal para Octal.");
        System.out.println("(c) Decimal para Hexadecimal");
        char resp = sc.next().charAt(0);

        switch (resp) {
            case 'a':
                System.out.println("Informe o número:");
                int a = sc.nextInt();
                String aa = Integer.toBinaryString(a);
                System.out.println("Número convertido para Binário: " + aa);
                break;
            case 'b':
                System.out.println("Informe o número:");
                int b = sc.nextInt();
                String bb = Integer.toOctalString(b);
                System.out.println("Número convertido para Octal: " + bb);
                break;
            case 'c':
                System.out.println("Informe o número:");
                int c = sc.nextInt();
                String cc = Integer.toHexString(c);
                System.out.println("Número convertido para Hexadecimal: " + cc);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        sc.close();
    }
}
