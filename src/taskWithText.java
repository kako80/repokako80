/* Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów
(nie biorąc pod uwagę tekstu „Starczy”). Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.
 */
import java.util.*;

public class taskWithText {
    public static  void main(String[] args) {
        System.out.println("Podaj tekst:");
        Scanner scan = new Scanner(System.in);
        String text;
        List<String> word = new ArrayList<>();
        String str = " ";
        for (; ; ) {
            text = scan.nextLine();
            if (Objects.equals(text, "starczy")) {
                break;
            } else
                word.add(text);
        }
        for (String elt : word) {
            if (elt.length() >= str.length()) {
                str = elt;
            }
        }
                if (Objects.equals(word.get(0), "")) {
                    System.out.println("Nie podano żadnego tekstu!");
                } else System.out.println(str);
    }
}
