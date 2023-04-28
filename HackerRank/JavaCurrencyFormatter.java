import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static final String INDIA = "\u20B9";
    public static final String CHINA = "\u00A5";
    public static final String EURO = "\u20AC";

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        double payment = Double.parseDouble(scanner.nextLine());

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String formatUs = numberFormatUS.format(payment);
        String formatIn = numberFormatIndia.format(payment).substring(1);
        String formatCh = numberFormatChina.format(payment).substring(1);
        String formatFr = numberFormatFrance.format(payment);
        String french = formatFr.substring(0, formatFr.length() - 2);

        System.out.println("US: " + formatUs);
        System.out.println("India: " + INDIA + "." + formatIn);
        System.out.println("Chine: " + CHINA + formatCh);
        System.out.println("France: " + french + EURO);
    }
}
