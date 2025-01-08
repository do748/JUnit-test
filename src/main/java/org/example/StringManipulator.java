package org.example;

public class StringManipulator {
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String normalized = input.replaceAll("[\\W]", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
