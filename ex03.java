
//3. Crie um método que receba 3 números e retorne o maior valor.
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();

        System.out.println("O maior valor é: " + maior(a, b, c));
    }

    static int maior(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > c && b > a) {
            return b;
        }
        else {
            return c;
        }
    }

}
