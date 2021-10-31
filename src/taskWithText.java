import java.util.*;


public class taskWithText {
    public static  void main(String[] args) {
        System.out.println("Podaj tekst:");
        Scanner scan = new Scanner(System.in);
        String text;
        List<String> word = new ArrayList<>();
        word.add(" ");
        for (; ; ) {
           text = scan.nextLine();
            if (Objects.equals(text, "starczy")) {
                break;
            } else
                for (String elt : word)
                    if (elt.length() <= text.length()) {
                        word.set(0, text);
                    } else {word.set(0, elt);
            System.out.println("Nie podano żadnego tekstu!");}
    }
        if (Objects.equals(word.get(0)," ")) {
            System.out.println("Nie podano żadnego tekstu!");
        } else System.out.println(word);
    }
}
