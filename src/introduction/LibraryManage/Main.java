package src.introduction.LibraryManage;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Book book2 = new Book("1984", "George Orwell", "987654321");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "112233445");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books available is the library");
        library.listBooks();
        System.out.println();

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        Staff staff1 = new Staff("Charlie", "S001");

        System.out.println("Borrowing books: ");
        member1.borrowBook(book1);
        member2.borrowBook(book2);
        member1.borrowBook(book1);
        System.out.println();

        staff1.borrowBook(book3);
        System.out.println();

        System.out.println("Books available is the library after borrowing");
        library.listBooks();
        System.out.println();

        System.out.println("Returning books: ");
        member1.returnBook(book1);
        System.out.println();

        Book book4 = new Book("Moby Dick", "Herman Melville", "554433221");
        staff1.addBook(library,book4);

        System.out.println("Books available in the library after returning and adding");
        library.listBooks();
    }
}
