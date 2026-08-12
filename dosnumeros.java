import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = entrada.nextDouble();

        double suma = num1 + num2;

        System.out.println("La suma es: " + suma);

        entrada.close();
    }
}