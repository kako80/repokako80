import java.util.Scanner;


public class theProgramStutter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj tekst:");
        String text = scan.nextLine();
        String[] text1 = text.split(" ");
        for (String i: text1){
            i += " " + i + " ";
        System.out.print(i);}
    }
}