import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class dateOfClasses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj datę zajęć w formacie 'YYYY-MM-DD' : ");
        String date = scan.next();
        LocalDate datePars = LocalDate.parse(date);
        LocalDate date0 = LocalDate.now();
        System.out.println("Data dzisiejsza: " + date0 + "   Data najbliższych zajęć: " + date);
        Period theNumberOfDays = Period.between(date0,datePars);
        System.out.println("Następne zajęcia będą za: " + theNumberOfDays.getYears() + " l. " + theNumberOfDays.getMonths() + " m. " + theNumberOfDays.getDays() + " d.");
    }
}
