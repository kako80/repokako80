import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scan.nextInt();
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
