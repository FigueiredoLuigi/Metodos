
//7. Crie um método que receba 3 valores (a, b, c) e retorne verdadeiro se a>b>c e falso em caso contrário.
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("digite o primeiro valor: ");
        int a = tec.nextInt();
        System.out.println("digite o segundo valor: ");
        int b = tec.nextInt();
        System.out.println("digite o terceiro valor: ");
        int c = tec.nextInt();

        System.out.println(resultado(a,b,c));

        tec.close();
    }

    static boolean resultado(int a, int b, int c) {
        if (a > b && b > c) {
            return true;
        } else {
            return false;
        }
    }

 }
