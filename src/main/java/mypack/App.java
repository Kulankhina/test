package mypack;

import java.util.Arrays;

/**
 * Test class used to verify that the environment was installed correctly.
 */
public class App {
    public static void main(String[] args) {
        String[] ar = {"1", "2"};
        Arrays.stream(ar)
                .forEach(s -> {
                    System.out.println("this is a test " + s);
                });
    }

    boolean returnTrue() {
        return true;
    }
}
