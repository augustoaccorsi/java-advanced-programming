package com.augustoaccorsi.chapter4.parallelstreams;

import com.augustoaccorsi.chapter4.streams.Book;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<com.augustoaccorsi.chapter4.streams.Book> books = populateLibrary();

        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);
    }

    static ArrayList<com.augustoaccorsi.chapter4.streams.Book> populateLibrary() {
        ArrayList<com.augustoaccorsi.chapter4.streams.Book> books = new ArrayList();
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Alice Walker", "The Color Purple"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Alice Walker", "Meridian"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Toni Morrison", "Beloved"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Toni Morrison", "Jazz"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Toni Morrison", "Paradise"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("John Steinbeck", "East of Eden"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Jane Austen", "Pride and Prejudice"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Jane Austen", "Emma"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Jane Austen", "Persuasion"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Jane Austen", "Mansfield Park"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new com.augustoaccorsi.chapter4.streams.Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }

}
