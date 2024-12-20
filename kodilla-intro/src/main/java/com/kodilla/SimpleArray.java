package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] favoriteBooks = new String[] {
                "Fourth wing",
                "Divine Rivals",
                "Summer of broken rules",
                "Throne of Glass",
                "Harry Potter"
        };

        String favoriteBook = favoriteBooks[3];

        System.out.println(favoriteBook);

        int numberOfBooks = favoriteBooks.length;

        System.out.println(numberOfBooks);
    }
}
