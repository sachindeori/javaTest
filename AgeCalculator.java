import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year (YYYY): ");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your birth month (MM): ");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your birth day (DD): ");
        int birthDay = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");
    }
}