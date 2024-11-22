package src.introduction.LibraryManage;

public class Member extends LibraryUser{

    private static final int MAX_BORROW_LIMIT = 5;
    private int borrowBooks = 0;

    public Member(String name, String userId){
        super(name,userId);
    }
    @Override
    public void borrowBook(Book book){
        if (borrowBooks < MAX_BORROW_LIMIT && book.getAvailable()){
            borrowBooks++;
            book.setIsAvailable(false);
            System.out.println(getName()+" borrowed "+ book.getTitle());
        }
    }

    @Override
    public void returnBook(Book book){
        borrowBooks--;
        book.setIsAvailable(true);
        System.out.println(getName()+" returned "+book.getTitle());
    }
}

