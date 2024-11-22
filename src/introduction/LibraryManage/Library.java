package src.introduction.LibraryManage;

import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void listBooks(){
        for (Book book : books){
            book.displayDetails();
        }
    }
}
