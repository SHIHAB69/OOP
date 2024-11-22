package src.introduction.LibraryManage;

import src.properties.abstractDemo.Son;

public class Book extends LibraryItem{
    public Book(String title, String author, String isbn){
        super(title, author, isbn);
    }
    
    @Override
    public void displayDetails(){
        System.out.println("Book title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("ISBN: "+getIsbn());
        System.out.println("Available: "+getAvailable());
    }
}
