import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023 */

public class App {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Qual a sua altura? ");
    double altura = entrada.nextDouble();

    System.out.printf("O seu peso ideal caso você seja HOMEM é: %.2f" , ((72.7 * altura) - 58));
    System.out.println();
    System.out.printf("O seu peso ideal caso você seja MULHER é: %.2f" , ((62.1 * altura) - 44.7));
    entrada.close();

    }
}