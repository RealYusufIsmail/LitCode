package math;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int combinations = Factorial.handleFactorial(8);
        int combinations3 = Factorial.handleFactorial(6);

        System.out.println(combinations / (4 * combinations3));

        System.out.println(2+4+8+16+32);
    }
}

