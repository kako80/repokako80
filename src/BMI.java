/* Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie.
Program powinien wczytywać od użytkownika dwie zmienne: wagę w kilogramach (typ float) oraz wzrost w centymetrach (typ int).
BMI powinno zostać wyliczone zgodnie z poniższym wzorem: BMI = masa[w kilogramach] / wzrost [w metrach]^2
Optymalny zakres BMI wynosi od 18.5 do 24.9, wartości mniejsze lub większe są wartościami nieoptymalnymi.
Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.
 */
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj masę ciała w kg: ");
        float weight = scan.nextFloat();

        System.out.print("podaj wzrost w cm: ");
        int size = scan.nextInt();
        scan.close();
        float BMI = weight / (0.0001f * size * size);
        System.out.print("BMI wynosi: " + BMI);
        if (BMI>18.5 && BMI<24.9) {
            System.out.println("BMI optymalne");
        }
        else System.out.println("BMI nieoptymalne");

    }
}
