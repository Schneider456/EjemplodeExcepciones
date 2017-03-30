import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    /**
     * Este método realiza la division de dos números
     * @param num1 valor del primer número
     * @param num2 valor del segundo número
     * @return Regresa la división de los números
     */

    public static int divideNumero (int num1, int num2) {
        return num1 / num2;
    }

    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.print("Valor del primer numero: ");
                int numero1 = entrada.nextInt();

                System.out.print("Valor del segundo numero: ");
                int numero2 = entrada.nextInt();

                int res = Principal.divideNumero(numero1, numero2);

                System.out.println("Resultado = " + res);
                correcto = true;
            } catch (InputMismatchException excepcionEntrada) {
                System.out.println("La entrada no concuerda con un número entero");
                entrada.nextLine();
            } catch (ArithmeticException excepcionAritmetica) {
                System.out.println("El denominador no puede ser cero");
                entrada.nextLine();
            }
        } while (!correcto);
    }
}