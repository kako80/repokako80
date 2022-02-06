/* Napisz program realizujący prosty kalkulator. Program powinien:
a. pobrać pierwszą liczbę (typu float)
b. pobrać jeden ze znaków: + - / *
c. pobrać drugą liczbę (typu float)
d. zwrócić wynik pobranego działania
Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać „Błędny znak”.
eśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki),
to program powinien wypisać napis „Błąd”.
 */
import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        String mathSign;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę działania a:");
        float a = scan.nextFloat();
        for (;;) {
            System.out.print("Podaj rodzaj działania:");
            mathSign = scan.next();
            switch (mathSign) {
                case "+" -> System.out.println(" + ");
                case "-" -> System.out.println(" - ");
                case "/" -> System.out.println(" / ");
                case "*" -> System.out.println(" * ");
                default -> System.out.println("Błędny znak");
            }
            if (!Objects.equals(mathSign, "+")&&!Objects.equals(mathSign, "-")&&!Objects.equals(mathSign, "*")
                    &&!Objects.equals(mathSign, "/")) {
                System.out.println();
            } else break;
        }
        System.out.print("Podaj drugą liczbę działania b:");
        float b = scan.nextFloat();
        calc(a, b, mathSign);
        scan.close();
    }
    public static void calc (float a, float b, String mathSign) {
        float v;
        switch (mathSign){
            case "+" -> {v = a + b;System.out.println("wynik działania: " + a + " " + mathSign + " " + b + " = " + v);}
            case "-" -> {v = a - b;System.out.println("wynik działania: " + a + " " + mathSign + " " + b + " = " + v);}
            case "/" -> {
                if (b == 0) {
                    System.out.println("Błąd");
                } else
            {v = a / b;System.out.println("wynik działania: " + a + " " + mathSign + " " + b + " = " + v);}
            }
            case "*" -> {v = a * b;System.out.println("wynik działania: " + a + " " + mathSign + " " + b + " = " + v);}
        }
    }
}
