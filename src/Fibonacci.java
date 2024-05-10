import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números de la secuencia que deseas ver:");
        int cantidad = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%d \n", a);

            int aux = a + b;
            a = b;
            b = aux;
        }
    }
}
