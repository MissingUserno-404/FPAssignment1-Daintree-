public class Book {

    private String title;
    private int quantity;
    private boolean available;

    public Book(String title, int quantity, boolean available){
        this.title = title;
        this.quantity = quantity;
        this.available = available;
    }

    /*
    public void Book() {
        title = "MISSING TITLE";
        quantity = 0;
        available = false;
    }
    */

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