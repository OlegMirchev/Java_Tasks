import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String dayWeek = getDay(input);

        System.out.println(dayWeek);
    }

    public static String getDay(String input) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate localDate = LocalDate.parse(input, dateTimeFormatter);

        DayOfWeek dow = localDate.getDayOfWeek();

        return dow.toString();
    }
}
