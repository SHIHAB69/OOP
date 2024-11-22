package src.introduction.LibraryManage;

public abstract class LibraryItem {
    private String title;
    private String author;
    private String isbn;

    private boolean isAvailable = true;

    public LibraryItem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle(){
        return title;
    }
    public  String getAuthor(){
        return  author;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean getAvailable(){
        return  isAvailable;
    }

    public void setIsAvailable(boolean available){
        isAvailable = available;
    }
    public abstract void displayDetails();
}

