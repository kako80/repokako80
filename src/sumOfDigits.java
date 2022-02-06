/* Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr podanej liczby.
Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze, możesz obliczać resztę z dzielenia liczby przez 10
(aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).
 */
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scan.nextInt();
        scan.close();
            System.out.print("suma cyfr liczby " + number + " wynosi: " + sum(number));
    }
    public static int sum(int number) {int i = 1; int sum1 = 0;
        do {
            if (i < number) sum1 = (sum(number%i)) + (number/i);
            else break;
            i = i * 10;
        } while (i < number); return sum1;
    }
}
