import java.util.Objects;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        String mathSign;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę działania a:");
        float a = scan.nextFloat();
        for (;;) {
            System.out.println("Podaj rodzaj działania:");
            mathSign = scan.next();
            switch (mathSign) {
                case "+" -> System.out.println(" + ");
                case "-" -> System.out.println(" - ");
                case "/" -> System.out.println(" / ");
                case "*" -> System.out.println(" * ");
                default -> System.out.println("Błedny znak");
            }
            if (!Objects.equals(mathSign, "+")&&!Objects.equals(mathSign, "-")&&!Objects.equals(mathSign, "*")&&!Objects.equals(mathSign, "/")) {
                System.out.println();
            } else break;
        }
        System.out.println("Podaj drugą liczbę działania b:");
        float b = scan.nextFloat();
        System.out.println("wynik działania: " + a + " " + mathSign + " " + b + " = " + calc(a, b, mathSign));
        scan.close();
    }
    public static float calc (float a, float b, String mathSign) {
        float v = 0;
        switch (mathSign){
            case "+" -> { v = a + b; }
            case "-" -> { v = a - b; }
            case "/" -> { v = a / b; }
            case "*" -> { v = a * b; }
            default -> System.out.println("Błąd");
        } return v ;
    }

}
