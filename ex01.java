package metodos;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int a = tec.nextInt();
        int b = tec.nextInt();

        System.out.println("O maior é: " + maior(a, b));
    }

    static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
