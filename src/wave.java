/*Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i narysuje falę o zadanej długości i
wysokości 4 linijek, zgodnie z poniższym schematem (puste pola uzupełniaj spacjami):
   *     **      **
    *   *  *    *  *    *
     * *    *  *    *  *
      **     **      **
 */
import java.util.Scanner;

public class wave {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         System.out.print("Podaj długość fali mniejszą od 100 000: ");
        int waveLength = scan.nextInt();
        String[][] wave = new String[4][100000];
        scan.close();
        for (int i = 0; i < wave.length; i++) {
            for (int j = 0; j < waveLength; j++) {
                wave[i][j] = " ";

                for (int k = 0; k <= 7; k++)
                if (k <= 3 && (i-k)%4 == 0 && (j-k)%8 == 0)
                { wave[i][j] = "*"; }
                else if (k >= 4 && ((i+1)+k)%4 == 0 && (j-k)%8 == 0)
                { wave[i][j] = "*"; }
            }
        }
        for (String[] strings : wave) {
            for (int j = 0; j < waveLength; j++) {
                System.out.printf("%3s", strings[j]);
            }
            System.out.println();
        }
    }
}




