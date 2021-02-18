package de.timon.dao;

import de.timon.data.Book;

public class Pack {

    public Book[] books;
    public int size;

    public Pack(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }

        }
        return false;
    }
}
