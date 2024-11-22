package src.introduction.LibraryManage;

public abstract class LibraryUser {
    private String name;
    private String id;

    public LibraryUser(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public abstract void returnBook(Book book);

    public abstract void borrowBook(Book book);
}

