import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj średnicę okręgu: ");
        float diameter = scan.nextFloat();
        float pi = 3.14f;
        float circuit;
        double circouit2;
        circuit = pi * diameter;
        circouit2 = Math.PI * diameter;
        System.out.println("obwód okręgu circuit wynosi: " + circuit + " obwód okręgu circuit2 wynosi: " + circouit2);
    }
}
