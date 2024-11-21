package org.example;

/*Создайте класс Book и Author.
Книгу могут написать много авторов (в классе Book есть поле Author[] authors).
Создайте конструкторы, методы get/set (где необходимо сделайте проверку), а также метод toString().
Создайте массив из 5 книг.*/

import java.util.Arrays;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Book {
    private String title;
    private Author[] authors;

    public Book(String title, Author[] authors) {
        if (authors == null || authors.length == 0) {
            throw new IllegalArgumentException("У книги должен быть хотя бы один автор.");
        }
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Книга: " + title + ", Авторы: " + Arrays.toString(authors);
    }
}

public class Work3 {
    public static void run() {
        Author author1 = new Author("Джон Толкин");
        Author author2 = new Author("Джоан Роулинг");
        Author author3 = new Author("Лев Толстой");

        Book[] books = {
                new Book("Властелин колец", new Author[]{author1}),
                new Book("Гарри Поттер", new Author[]{author2}),
                new Book("Война и мир", new Author[]{author3}),
                new Book("Сборник фантастики", new Author[]{author1, author2}),
                new Book("Антология литературы", new Author[]{author1, author2, author3})
        };

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
