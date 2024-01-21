package algorithms;

import java.util.Scanner;

public class TheTimeInWords {
    public static String[] CLOCK_OF_WORDS = {"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine",
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();

        switch (minutes) {
            case 0 -> System.out.println(CLOCK_OF_WORDS[hour] + " o' clock");
            case 1 -> System.out.println("one minute past " + CLOCK_OF_WORDS[hour]);
            case 15 -> System.out.println("quarter past " + CLOCK_OF_WORDS[hour]);
            case 30 -> System.out.println("half past " + CLOCK_OF_WORDS[hour]);
            case 45 -> System.out.println("quarter to " + CLOCK_OF_WORDS[hour + 1]);
            case 59 -> System.out.println("one minute to " + CLOCK_OF_WORDS[hour + 1]);
            default -> {
                if (minutes < 30) {
                    System.out.println(CLOCK_OF_WORDS[minutes] + " minutes past " + CLOCK_OF_WORDS[hour]);
                } else {
                    System.out.println(CLOCK_OF_WORDS[60 - minutes] + " minutes to " + CLOCK_OF_WORDS[hour + 1]);
                }
            }
        }
    }
}
