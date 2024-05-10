import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.printf("la suma es: %d\n", sum);
    }
}
