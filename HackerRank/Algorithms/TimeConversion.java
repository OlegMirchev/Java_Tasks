package algorithms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");

        DateFormat format = new SimpleDateFormat("HH:mm:ss");

        Date date = dateFormat.parse(input);

        String output = format.format(date);

        System.out.println(output);
    }
}
