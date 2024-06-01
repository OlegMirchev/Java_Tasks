package javaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] input = scanner.nextLine().split("");
            boolean isBalanced = false;

            List<String> ovalBrackets = new ArrayList<>();
            List<String> curlyBrackets = new ArrayList<>();
            List<String> squareBrackets = new ArrayList<>();

            if (input[0].equals(")") || input[0].equals("}") || input[0].equals("]")) {
                System.out.println(isBalanced);

                continue;
            }

            for (String clamp : input) {

                switch (clamp) {
                    case "(", ")" -> ovalBrackets.add(clamp);
                    case "{", "}" -> curlyBrackets.add(clamp);
                    case "[", "]" -> squareBrackets.add(clamp);
                }
            }

            long countOvalOpen = ovalBrackets.stream().filter(c -> c.equals("(")).count();
            long countOvalClose = ovalBrackets.stream().filter(c -> c.equals(")")).count();
            long countCurlyOpen = curlyBrackets.stream().filter(c -> c.equals("{")).count();
            long countCurlyClose = curlyBrackets.stream().filter(c -> c.equals("}")).count();
            long countSquareOpen = squareBrackets.stream().filter(c -> c.equals("[")).count();
            long countSquareClose = squareBrackets.stream().filter(c -> c.equals("]")).count();

            if (countOvalOpen == countOvalClose && countCurlyOpen == countCurlyClose && countSquareOpen == countSquareClose) {
                isBalanced = true;
            }

            System.out.println(isBalanced);
        }
    }

    // Second solution for this task.

    /*

    int loops = input.length() / 2;

 for (int i = 0; i <= loops; i++) {
    input = input.replaceAll("\\(\\)", "");
    input = input.replaceAll("\\[\\]", "");
    input = input.replaceAll("\\{\\}", "");
 }

    System.out.println(input.isEmpty());

     */
}
