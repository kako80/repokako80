import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj masę ciała: ");
        float weight = scan.nextFloat();

        System.out.println("podaj wzrost: ");
        int size = scan.nextInt();
        float BMI = weight / (0.0001f * size * size);
        System.out.println("BMI wynosi: " + BMI);
        if (BMI>18.5 && BMI<24.9) {
            System.out.println("BMI optymalne");
        }
        else System.out.println("BMI nieoptymalne");

    }
}
