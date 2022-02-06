/* Napisz program, który pobierze od użytkownika liczbę n (typu int) i obliczy sumę szeregu harmonicznego od 1 do n,
zgodnie ze wzorem poniżej: Hn = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */
import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[] args) {
        double harmonic = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę szeregu harmonicznego: ");
        int number = scan.nextInt();
        scan.close();
        for (int i = 1; i <= number; i++) {
            harmonic += 1 / (float) i;
        }
            System.out.println("Suma szeregu harmonicznego wynosi= " + harmonic);
    }
}
