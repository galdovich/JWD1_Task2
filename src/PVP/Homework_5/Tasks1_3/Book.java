package PVP.Homework_5.Tasks1_3;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private String authorName;
    private String authorSurname;
    private int published;
    static int count;

    public Book() {
    }

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Book(String nameOfBook, int published) {
        this.nameOfBook = nameOfBook;
        this.published = published;
    }

    public Book(String nameOfBook, String authorName, String authorSurname, int published) {
        this.nameOfBook = nameOfBook;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.published = published;
    }

    public String toString() {
        return "Название книги: " + this.nameOfBook + " | Имя автора: " + this.authorName + " | Фамилия автора: " + authorSurname + " | Год издания:  " + this.published;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return published == book.published &&
                Objects.equals(nameOfBook, book.nameOfBook) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorSurname, book.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, authorName, authorSurname, published);
    }
}
