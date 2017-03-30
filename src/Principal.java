import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    /**
     * Este método realiza la división de 2 números
     * @param num1 valor del primer número
     * @param num2 valor del segundo número
     * @return Regresa la división de los números
     */
    public static int divideNumeros(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String []args) {
        Scanner entrada = new Scanner(System.in);
        boolean correcto=false;
        do {
            try {
                System.out.println("Valor del 1° número: ");
                int num1 = entrada.nextInt();
                System.out.println("Valor del 2° número: ");
                int num2 = entrada.nextInt();
                int resultado = divideNumeros(num1, num2);
                System.out.println("Resultado = " + resultado);
                correcto=true;
            } catch (InputMismatchException e) {
                System.err.println("La entrada no concuerda con un número entero.");
            }
        } while(!correcto);
    }
}
