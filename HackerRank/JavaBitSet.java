package javaTask;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        for (int i = 1; i <= m; i++) {
            String command = scanner.next();
            int numb1 = scanner.nextInt();
            int numb2 = scanner.nextInt();

            switch (command) {
                case "AND" -> {
                    if (numb1 == 1 && numb2 == 2) {
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                }

                case "OR" -> {
                    if (numb1 == 1 && numb2 == 2) {
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                }

                case "XOR" -> {
                    if (numb1 == 1 && numb2 == 2) {
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                }

                case "FLIP" -> {
                    if (numb1 == 1) {
                        bitSet1.flip(numb2);
                    } else if (numb1 == 2) {
                        bitSet2.flip(numb2);
                    }
                }

                case "SET" -> {
                    if (numb1 == 1) {
                        bitSet1.set(numb2);
                    } else if (numb1 == 2) {
                        bitSet2.set(numb2);
                    }
                }

            }

            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}
