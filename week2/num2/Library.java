package week2.num2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public static void main(String[] args) {
        ArrayList<Book> booksA = Book.createBooks();
        ArrayList<Book> booksA1 = booksA;
        ArrayList<Book> booksB = Book.copyBooks(booksA);

        Library libraryA = new Library(booksA);
        Library libraryB = new Library(booksB);

        libraryA.changeBook("그 많던 싱아는 누가 다 먹었을까");
        libraryB.addBook("사피엔스", "유발 하라리");

        System.out.print("책 목록 A : ");
        for (Book book : booksA) {
            System.out.print(book.getName() + " ");
        }

        System.out.print("\n책 목록 A-1 : ");
        for (Book book : booksA1) {
            System.out.print(book.getName() + " ");
        }
        System.out.print("\n책 목록 B : ");
        for (Book book : booksB) {
            System.out.print(book.getName() + " ");
        }
    }

    private void addBook(String name, String author) {
        books.add(new Book(name, author));
    }

    private void changeBook(String name) {
        for (Book book : books) {
            if (book.getName().equals("자전거 도둑") && book.getAuthor().equals("박완서")){
                book.setName(name);
            }
        }
    }
}
