import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sneeze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean userSneeze = doesUserSneeze(userInput);

        if (userSneeze){
            System.out.println("Użytkownik kichnął.");
        } else {
            System.out.println("Użytkownik NIE kichnął.");
        }
        scanner.close();
    }
    public static boolean doesUserSneeze(String userInput) {
        Pattern sneezePatter = Pattern.compile("a+ psik");
        Matcher matcher = sneezePatter.matcher(userInput);
        return matcher.find();
    }
}
