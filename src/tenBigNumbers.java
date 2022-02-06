/* Napisz program, który pobierze od użytkownika 10 dowolnie dużych liczb (zmiennych typu int) i wypisze te,
 które wystąpiły minimum dwukrotnie.
 */
import java.util.*;

public class tenBigNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashSet<Integer> numbers1 = new HashSet<>();
       int[] numbers = new int[10];
        int i, j;
        for (i = 0; i < 10; i++){
            System.out.print("Podaj liczbę: " + (i + 1) + " ");
             numbers[i] = scan.nextInt();
        } scan.close();
        for (i = 0; i < numbers.length; i++) {
            for (j = i + 1; j < numbers.length ; j++ ) {
                if (numbers[i] == numbers[j]) {
                    numbers1.add(numbers[i]);
                }
            }
        }
        for (Integer integer : numbers1) {
            System.out.print("duplikat: " + integer + "  ");
        }
    }
}