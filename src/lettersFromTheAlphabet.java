/* Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char)
i wyliczy, ile znaków stoi w alfabecie pomiędzy podanymi literami. Podpowiedź – skorzystaj z tablicy kodów ASCII
i traktuj znaki jak liczby int.
 */
import java.util.Objects;
import java.util.Scanner;

public class lettersFromTheAlphabet {
    public static void main(String[] args) {

        String firstLetter, secondLetter;
        char firstLetterChar , secondLetterChar; int n1 , n2; int characterDistance;
         for (; ; ) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj pierwszą literę: ");
        firstLetter = scan.next();
        System.out.print("Podaj drugą literę: ");
        secondLetter = scan.next();
        firstLetterChar = firstLetter.charAt(0);
        secondLetterChar = secondLetter.charAt(0);
        n1 = firstLetterChar; n2 = secondLetterChar;
            if (firstLetter.length() == 1 && secondLetter.length() == 1 && lowercaseLetters(n1, n2)) {
            break;
            }
            else System.out.println("nieprawidłowa ilość/rodzaj znaków");
         }
        if (Objects.equals(firstLetter,secondLetter)){
            characterDistance = 0;
        } else
        characterDistance = Math.abs(Character.compare(firstLetterChar, secondLetterChar))-1;
        System.out.println("odległość między literami: " + firstLetter + " i " + secondLetter + " jest: " + characterDistance );
    }
    public static boolean lowercaseLetters(int n1, int n2){
        return n1 > 96 && n1 < 123 && n2 > 96 && n2 < 123;
    }
}

