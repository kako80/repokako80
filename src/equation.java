import java.util.Scanner;

public class equation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj współczynnik równania a= ");
        int a = scan.nextInt();
        System.out.println("podaj współczynnik równania b= ");
        int b = scan.nextInt();
        System.out.println("podaj współczynnik równania c= ");
        int c = scan.nextInt();
        System.out.println("równanie kwadratowe : " + a + "xkw + " + b + "x + " + c + " = 0");
        double delta = (b * b) - (4 * a * c);
        System.out.println("delta = " + delta);
        if (delta < 0) {
            System.out.println("delta jest ujemna");
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("pierwiastki z równania : x1 = " + x1 + "x2 = " + x2);
        }
        scan.close();
    }
}
