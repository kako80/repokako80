import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        for (;;) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int number = scan.nextInt();

            if (number >= 0)
                for (int i = 0; i <= number; i++) {
                    if (i % 3 == 0 && i % 7 == 0) {
                        System.out.println("pif paf");
                    } else if (i % 3 == 0) {
                        System.out.println("pif");
                    } else if (i % 7 == 0) {
                        System.out.println("paf");
                    } else System.out.println(i);
                }
            System.out.println("niepoprawna liczba"); break;
        }
    }

}
