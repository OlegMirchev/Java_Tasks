package javaTask.JavaVarargsSimpleAddition;

public class Add {

    public void add(int... arr) {
        int sum = 0;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            output.append(arr[i]);

            if (!(i == arr.length - 1)) {
                output.append("+");
            }
        }

        System.out.printf("%s=%d%n", output.toString().trim(), sum);
    }
}
