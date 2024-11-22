package src.introduction.LibraryManage;

public class Staff extends LibraryUser{


    public Staff(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        if (book.getAvailable()){
            book.setIsAvailable(false);
            System.out.println(getName()+" borrowed "+book.getTitle());
        }else {
            System.out.println("Book is unavailable");
        }
    }

    @Override
    public void returnBook(Book book) {
        book.setIsAvailable(true);
        System.out.println(getName()+" returned "+book.getTitle());
    }

    public void addBook(Library library, Book book ){
        library.addBook(book);
        System.out.println("Book added: "+ book.getTitle());
    }
}

