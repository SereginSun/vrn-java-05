package ru.dataart.academy.java;

/**
 * ReverseInteger - class that implements a method that takes any integer
 * and returns a number written in reverse order.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class ReverseInteger {

    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        long result = 0;
        while (inputNumber != 0) {
            int numRank = inputNumber % 10;
            result = result * 10 + numRank;
            inputNumber /= 10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new OutOfIntegerException("The number cannot be converted");
        }
        return (int) result;
    }
}
