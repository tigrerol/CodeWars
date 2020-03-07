package com.company;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        return Integer.parseInt(String.valueOf(num).chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
    }
}
