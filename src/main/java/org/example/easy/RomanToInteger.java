package org.example.easy;

public class RomanToInteger {
    public int romanToInt(String s) {

        int output = 0;
        int last = Integer.MAX_VALUE;

        for (char c : s.toUpperCase().toCharArray()) {
            int currentNumber = converter(c);
            if (currentNumber > last) {
                output = output-2 * last + currentNumber;
            } else output += currentNumber;
            last = currentNumber;
        }

        return output;
    }

    private int converter(char s) {
        return switch (s) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
