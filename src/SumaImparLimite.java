import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese limite inferior:");
        int min = sc.nextInt();

        System.out.println("Ingrese limite superior:");
        int max = sc.nextInt();

        int i =min;
        int sum=0;
        while (i<=max){
            if (i%2!=0) {
                sum += i;
            }
            i++;
        }
        System.out.printf("la suma es: %d\n", sum);
    }
}
