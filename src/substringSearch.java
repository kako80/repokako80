/* Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i wypisze długość najdłuższego
takiego podciągu tych liczb, który jest rosnący. Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7”
program powinien wypisać „5” jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).
 */
import java.util.Arrays;
import java.util.Scanner;

public class substringSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10]; int i; int count = 1; int count0 = 0;
        for (i = 0; i < 10; i++){
            System.out.print("Podaj liczbę " + (i + 1) + " : ");
            numbers[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(Arrays.toString(numbers));
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > numbers[j - 1]) {
                count += 1;
            } else {
                count = 1;
            }
            count0 = Math.max(count, count0);
        } System.out.print("Maksymalna długość podciągu: " + count0);
        }
}
