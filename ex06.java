
//6. Crie um método que receba 2 valores e retorne a sua soma. Se o valor da soma for negativo o método deverá retornar o valor 0.
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o primeiro valor a ser somado:");
        int a = tec.nextInt();

        System.out.println("Digite o segundo valor a ser somado:");
        int b = tec.nextInt();

        System.out.println("A soma dos dois resultados é: " + soma(a, b));
        tec.close();
    }

    static int soma(int a, int b) {
        if ((a + b) > 0) {
            return a + b;
        } else {
            return 0;
        }
    }
}
