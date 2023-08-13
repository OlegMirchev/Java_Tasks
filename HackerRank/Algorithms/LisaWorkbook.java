package algorithms;

import java.util.Scanner;

public class LisaWorkbook {
    public static int PAGE = 1;
    public static int SPECIAL_PROBLEMS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int numb = scanner.nextInt();
            int sumOfMaxNumb = k;

            for (int j = 1; j <= numb; j++) {

                if (j > sumOfMaxNumb) {
                    sumOfMaxNumb += k;
                    PAGE++;
                }

                if (j == PAGE) {
                    SPECIAL_PROBLEMS++;
                }
            }

            PAGE++;
        }

        System.out.println(SPECIAL_PROBLEMS);
    }
}
