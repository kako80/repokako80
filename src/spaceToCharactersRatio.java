import java.util.Objects;
import java.util.Scanner;

public class spaceToCharactersRatio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String longSentence = scan.nextLine();
        System.out.println(longSentence);
        int sum1 = 0,sum2 = 0;
        System.out.println("Liczba znaków w tekście: " + characters(longSentence, sum1));
        System.out.println("Liczba spacji w tekście: " + space(longSentence, sum2));
        double ratio = (((float)space(longSentence, sum2)) / ((float)characters(longSentence, sum1))) * 100;
        System.out.println("tekst zawiera: " + ratio + " % spacji w tekście");
    }
    public static int characters(String longSentence, int sum1){
        for (int i = 0; i <= longSentence.length(); i++) {
            sum1 = i;
        } return sum1;
    }
    public static int space(String longSentence, int sum2){
        for (int i = 0; i < longSentence.length(); i++){
            if (Objects.equals(longSentence.charAt(i),' ')){
                sum2 += 1;
            }
        } return sum2;
    }
}
