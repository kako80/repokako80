/* Napisz program, który będzie z Tobą grał w „za dużo, za mało”. Na początku komputer losuje liczbę z zakresu od
 0 do 100 (podpowiedź: skorzystaj z metody Random.nextInt()) a następnie czeka na podanie liczby przez użytkownika.
 Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer, program powinien wypisać „za dużo” i czekać
 na podanie kolejnej liczby. Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „za mało” i analogicznie
 czekać na następną liczbę. Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!”
 i zakończyć się.
 */

import java.util.Random;
import java.util.Scanner;

public class tooMuchToLittle {
    public static void main(String[] args) {

        Random random = new Random();
        int wantedNumber = random.nextInt(101);
        for (;;) {
        System.out.print("podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
            int givenNumber = scan.nextInt();
            if (wantedNumber == givenNumber) {
                System.out.println("Bingo!");
                scan.close();
                break;
            } else if (wantedNumber < givenNumber) {
                System.out.println("za dużo");
            } else {
                System.out.println("za mało");
            }
        }
    }
}
