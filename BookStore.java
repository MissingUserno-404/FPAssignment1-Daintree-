import java.util.*;

public class BookStore {

    static Book[] bookList = new Book[5];
    
    public static void main(String[] args){

        bookList[0] = new Book("Absolute Java" , "Savitch", 5, true);
        bookList[1] = new Book("JAVA:How to Program", "Deitel and Deitel", 0, true);
        bookList[2] = new Book("Computing Concepts with JAVA 8 Essentials", "(Horstman)", 5, false);
        bookList[3] = new Book("Java Software Solutions", "Lewis and Loftus", 5, false);
        bookList[4] = new Book("Java Program Design", "Cohoon and Davidson", 1, true);

        Scanner SC = new Scanner(System.in);
        int selection = 0;

        System.out.println("Welcome to Daintree");
        boolean running = true;
        while(running == true){
            PrintMainUI();
            selection = SC.nextInt();
            if(ValidateOptionUI(selection) == true){
                if (selection == 0) {
                    running = false;
                    System.out.println("Goodbye!");
                } else {
                    RunSelectUI(selection);
                }

            } else {
                System.out.println("Invalid selection");
            }
        }
    }

    public static void RunSelectUI(int UI){
        switch (UI){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:
                PrintAllBooks(bookList);
                break;

            default:
                System.out.println("Error: Invalid option in RunSelectUI method");
        }

    }

    public static int FindBook(String searchString){
        for (int i = 0; i < bookList.length; i++){
            
        }
    }

    public static void PrintAllBooks(Book[] list){
        for(int i = 0; i < bookList.length; i++){
            System.out.println(list[i].getTitle());
        }
    }

    public static void PrintMainUI(){
        System.out.println("Choose an option");
        System.out.println("1. Add a book to shopping cart");
        System.out.println("2. View Shopping cart");
        System.out.println("3. Remove a book from shopping cart");
        System.out.println("4. Checkout");
        System.out.println("5. List all books");
        System.out.println("0. Quit");
        System.out.print("Please make a selection: ");
    }

    public static boolean ValidateOptionUI(int i){
        final int MAX_UI_INPUT = 5;
        final int MIN_UI_INPUT = 0;

        boolean validity = false;

        if(i >= MIN_UI_INPUT && i <= MAX_UI_INPUT) {
            validity = true;
        } else {
            System.out.println("Out of bounds input: " + i);
        }
        return validity;
    }

}