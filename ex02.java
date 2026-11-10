package metodos;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int a = tec.nextInt();
        int b = tec.nextInt();

        System.out.println("O menor é: " + menor(a, b));

    }

    static int menor(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

}
