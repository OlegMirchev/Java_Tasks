package javaTask;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(text.getBytes(StandardCharsets.UTF_8));
        byte[] digest = messageDigest.digest();

        String result = String.format("%064x", new BigInteger(1, digest));

        System.out.println(result);
    }
}
