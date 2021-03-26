public class Book {

    private String title;
    private String author;
    private int quantity;
    private boolean available;

    public Book(String title, String author, int quantity, boolean available){
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.available = available;
    }

    public String getTitle(){
        return title;
    }

    public int getQuantity(){
        return quantity;
    }

    public boolean getAvailable(){
        return available;
    }

}