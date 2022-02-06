/* Napisz program służący do rozwiązywania równania kwadratowego.
Program powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b, c)
i wyliczyć pierwiastki x1, x2 równania: a*x^2 + b*x + c = 0
Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i zakończ program. Potrzebne wzory:
 delta = b^2 - 4*a*c; x1 = (-b - Math.sqrt(delta)) / (2 * a); x2 = (-b + Math.sqrt(delta)) / (2 * a);
 */
import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("podaj współczynnik równania a= ");
        int a = scan.nextInt();
        System.out.print("podaj współczynnik równania b= ");
        int b = scan.nextInt();
        System.out.print("podaj współczynnik równania c= ");
        int c = scan.nextInt();
        System.out.println("równanie kwadratowe : " + a + "xkw + " + b + "x + " + c + " = 0");
        double delta = (b * b) - (4 * a * c);
        System.out.println("delta = " + delta);
        if (delta < 0) {
            System.out.println("delta jest ujemna.");
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.print("pierwiastki z równania : x1 = " + x1 + " x2 = " + x2);
        }
        scan.close();
    }
}
