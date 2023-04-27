import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaAnagrams {
    public static String IS_ANAGRAM = "Not Anagrams";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstWord = scanner.nextLine().split("");
        String[] secondWord = scanner.nextLine().split("");

        List<String> firstList = Arrays.stream(firstWord).map(String::toLowerCase).collect(Collectors.toList());
        List<String> secondList = Arrays.stream(secondWord).map(String::toLowerCase).collect(Collectors.toList());

        Collections.sort(firstList);
        Collections.sort(secondList);

        if (firstList.toString().contains(secondList.toString())) {
            IS_ANAGRAM = "Anagrams";
        }

        System.out.println(IS_ANAGRAM);
    }
}
