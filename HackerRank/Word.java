package javaTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Word {
    public static int index = 0;
    public static int removeLetter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> words = new ArrayList<>();

        while (!input.equals("End")) {
            words.add(input);

            input = scanner.nextLine();
        }

        removeCountLetter(words);

        System.out.println(removeLetter);
    }

    private static void removeCountLetter(List<String> words) {

        String[] firstLetter;
        String[] secondsLetter;

        while (true) {

            firstLetter = words.get(index).split("");

            index++;

            if (index >= words.size()) {
                break;
            }

            secondsLetter = words.get(index).split("");

            for (int i = 0; i < firstLetter.length; i++) {
                for (int j = 0; j < secondsLetter.length; j++) {
                    if (firstLetter[i].equals(secondsLetter[j])) {
                        firstLetter[i] = "";
                        secondsLetter[j] = "";
                    }
                }
            }

            List<String> firstCollect = Arrays.stream(firstLetter).filter(l -> !l.equals("")).toList();
            List<String> secondCollect = Arrays.stream(secondsLetter).filter(l -> !l.equals("")).toList();

            removeLetter += firstCollect.size() + secondCollect.size();
        }
    }
}
