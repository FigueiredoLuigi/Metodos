
//4. Crie um método que receba 3 números e retorne o menor valor.
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite 3 números");
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();

        System.out.println("O menor valor é: " + menor(a, b, c));
    }

    static int menor(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

}
