import java.util.Arrays;
import java.util.Scanner;

public class substringSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10]; int i; int count = 1; int count0 = 0;// int res = 0;
        for (i = 0; i < 10; i++){
            System.out.print("Podaj liczbę " + (i + 1) + " : ");
            numbers[i] = scan.nextInt();
        } scan.close();
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
