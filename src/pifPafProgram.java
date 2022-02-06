/* Napisz program, który pobierze od użytkownika dodatnią liczbę (typu int) i
wypisze wszystkie liczby od 1 do podanej liczby, każda w kolejnej linijce, z następującymi zmianami:
● w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”
● w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”
● jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif paf”
 */
import java.util.Objects;
import java.util.Scanner;

public class pifPafProgram {
    public static void main(String[] args) {

        for (;;) {
            Scanner scan = new Scanner(System.in);
            System.out.print("podaj liczbę: ");
            int number = scan.nextInt();
            if (number >= 0) {
                for (int i = 0; i <= number; i++) {
                    if (i % 3 == 0 && i % 7 == 0) {
                        System.out.println("pif paf");
                    } else if (i % 3 == 0) {
                        System.out.println("pif");
                    } else if (i % 7 == 0) {
                        System.out.println("paf");
                    } else System.out.println(i);
                }
            } else System.out.println("liczba nieprawidłowa");
            Scanner scan2 = new Scanner(System.in);
            System.out.println("press 'y' to continue:");
            String letter = scan2.next();
            if (Objects.equals(letter, "y")){
                System.out.println();
            } else {scan.close();
                scan2.close();
                break;
            }
        }
    }
}
