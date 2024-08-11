package javaTask.JavaVarargsSimpleAddition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Add add = new Add();

        add.add(arr[0], arr[1]);
        add.add(arr[0], arr[1], arr[2]);
        add.add(arr[0], arr[1], arr[2], arr[3], arr[4]);
        add.add(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
    }
}
