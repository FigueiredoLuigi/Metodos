
/*5. Crie um aplicativo de conversão entre as temperaturas Celsius e Fahrenheit. Primeiro o usuário deve escolher se vai entrar com a temperatura em Celsius ou Fahrenheit, depois a conversão escolhida é realizada através de um comando SWITCH. Não esqueça de criar um método que receberá os parâmetros necessários para realizar a conversão.
					
Se C é a temperatura em Celsius e F em fahrenheit, as fórmulas de conversão são:
					
C= 5.(F-32)/9 F= (9.C/5) + 32					
*/
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Qual temperatura você deseja converter entre Celsius e Fahrenheit (C/F)?");
        char tipoTemp = tec.next().toUpperCase().charAt(0);

        System.out.println("Qual é o valor da temperatura?");
        double temp = tec.nextDouble();

        System.out.printf("A temperatura convertida é de: %.2fº", formula(tipoTemp, temp));
    }

    static double formula(char tipoTemp, double temp) {
        switch (tipoTemp) {
            case 'C':
                return (9.0 * temp / 5.0) + 32;
            case 'F':
                return 5.0 * (temp - 32) / 9.0;
            default:
                System.out.println("Opção inválida!");
                return 0;
        }
    }
}
