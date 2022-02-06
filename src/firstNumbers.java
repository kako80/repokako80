/* Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
i wypisze wszystkie liczby pierwsze, większe od 1 i mniejsze od podanej liczby.
 */
import java.util.Objects;
import java.util.Scanner;

public class firstNumbers {
    public static void main(String[] args) {

        for (;;) {
            int i, j;
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj liczbę mniejszą od 10 000: ");
            int number = scan.nextInt();
            int[] array1 = new int[10000];
            int x = (int) Math.floor(Math.sqrt(number));
            for (i = 1; i <= number; i++) array1[i] = i;
            for (i = 2; i <= x; i++) {
                if (array1[i] != 0) {
                    j = i + i;
                    while (j <= number) {
                        array1[j] = 0;
                        j += i;
                    }
                }
            }
            for (i = 2; i <= number; i++)
                if (array1[i] != 0)
                    System.out.println("wynik " + i);
            Scanner scan2 = new Scanner(System.in);
            System.out.println("press 'y' to continue:");
            String letter = scan2.next();
            if (Objects.equals(letter, "y")) {
                System.out.println();
            } else { scan.close();
                scan2.close();
                break;
            }
        }
    }
}
