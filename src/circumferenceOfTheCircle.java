/*Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float) i
obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14,
a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.
 */
import java.util.Scanner;

public class circumferenceOfTheCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("podaj średnicę okręgu: ");
        float diameter = scan.nextFloat();
        scan.close();
        float pi = 3.14f;
        float circuit;
        double circouit2;
        circuit = pi * diameter;
        circouit2 = Math.PI * diameter;
        System.out.println("obwód okręgu circuit wynosi: " + circuit + " obwód okręgu circuit2 wynosi: " + circouit2);
    }
}
