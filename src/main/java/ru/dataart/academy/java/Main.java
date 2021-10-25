package ru.dataart.academy.java;

/**
 * Main class.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        try {
            System.out.printf("Reverse integer works: %d%n",
                    reverseInteger.reverse(-456));
            System.out.printf("Reverse integer works for big negative value: %d%n",
                    reverseInteger.reverse(-2147483648));
            System.out.printf("Reverse integer works for big positive value: %d%n",
                    reverseInteger.reverse(-2147483647));
        } catch (OutOfIntegerException oie) {
            oie.printStackTrace();
        }
    }
}