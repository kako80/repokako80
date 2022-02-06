/* Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę Fibonacciego
o wskazanym indeksie. Przykładowo, jeśli użytkownik poda liczbę 5, Twój program powinien wypisać piątą liczbę Fibonacciego.
Kolejne liczby Fibonacciego powstają poprzez zsumowanie dwóch poprzednich liczb Fibonacciego.
Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
 */
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj szukaną liczbą ciagu Fibonacciego: ");
        int n = scan.nextInt();
            System.out.println("Szukaną liczbą ciągu Fibonacciego : " + fib(n));
            scan.close();
    }
        public static int fib(int n){
            if ((n == 1) || (n == 2))
               return 1;
           else
                return fib(n-1)+fib(n-2);
        }
}
