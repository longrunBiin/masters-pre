package week2.num2;

import java.util.ArrayList;

public class Book {
    private String name;

    private String author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Book> copyBooks(ArrayList<Book> original){
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : original) {
            books.add(new Book(book.name, book.author));
        }

        return books;
    }

    public static ArrayList<Book> createBooks(){
        Book book1 = new Book("태백산맥", "조정래");
        Book book2 = new Book("이기적 유전자", "리처드 도킨스");
        Book book3 = new Book("자전거 도둑", "박완서");
        Book book4 = new Book("토지", "박경리");
        Book book5 = new Book("대변동", "제레드 다이아몬드");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        return books;
    }
}
