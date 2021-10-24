import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[] args) {

        double harmonic = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę szeregu harmonicznego:");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            harmonic += 1 / (float) i;

        }
            System.out.println("Suma szeregu harmonicznego wynosi= " + harmonic);



    }
}
