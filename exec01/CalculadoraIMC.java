package exec01;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double peso, altura, imc;

        peso = leitor.nextDouble();
        altura = leitor.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("O IMC é: %.2f%n", imc);

        leitor.close();
    }
}
