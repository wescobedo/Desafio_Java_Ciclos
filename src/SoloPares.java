import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int n = sc.nextInt();

        int i =0;
        int cont=0;
        while (cont<n){
            if (i%2==0) {
                cont ++;
                System.out.printf("%d\n", i);
            }
            i++;
        }
    }
}
