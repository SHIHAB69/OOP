package src.intermediateLvl;
import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Libreary lian = new Libreary();
        lian.addBook(new Book("B","a","asd"));
        lian.displayBooks();
        Book book = new Book("as","as","as");

    }
   static class Book{
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn){
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }


        public String getTitle(){
            return title;
        }

        public String getDetails(){
            return "Title: "+ title + ", Author: "+author+", ISBN: "+isbn;
        }
    }

    static class Libreary{
        private ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book){
            books.add(book);
            System.out.println("Book added: "+book.getTitle());
        }

        public void removeBook(String title){
            books.removeIf(book->book.getTitle().equals(title));
            System.out.println("Book removed: "+title);
        }

        public void displayBooks(){
            System.out.println("Library Books");
            for(Book book: books){
                System.out.println(book.getDetails());
            }
        }
    }
}
