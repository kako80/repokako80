/* Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String),
a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po dwa razy.
Przykładowo, dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest mój mój test test”.
 */
import java.util.Scanner;

public class theProgramStutter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj tekst:");
        String text = scan.nextLine();
        scan.close();
        String[] text1 = text.split(" ");
        for (String i: text1){
            i += " " + i + " ";
        System.out.print(i);}
    }
}