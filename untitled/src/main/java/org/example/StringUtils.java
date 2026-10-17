package org.example;

public class StringUtils {

    private StringUtils() {}

    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("Input cannot be null");
        String cleaned = s.toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static int countWords(String s) {
        if (s == null) throw new IllegalArgumentException("Input cannot be null");
        String trimmed = s.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }

    public static String reverse(String s) {
        if (s == null) throw new IllegalArgumentException("Input cannot be null");
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) throw new IllegalArgumentException("Arguments cannot be null");
        char[] ca = a.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] cb = b.toLowerCase().replaceAll("\\s", "").toCharArray();
        java.util.Arrays.sort(ca);
        java.util.Arrays.sort(cb);
        return java.util.Arrays.equals(ca, cb);
    }

    public static String capitalize(String s) {
        if (s == null) throw new IllegalArgumentException("Input cannot be null");
        if (s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
}
