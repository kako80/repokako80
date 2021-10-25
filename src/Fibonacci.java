import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj szukaną liczbą ciagu Fibonacciego");
        int n = scan.nextInt();
            System.out.println("Szukaną liczbą ciągu Fibonacciego : " + fib(n));
    }

        public static int fib(int n){
            if ((n == 1) || (n == 2))
               return 1;
           else
                return fib(n-1)+fib(n-2);
        }

}
