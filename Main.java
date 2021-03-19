public class Main {
    public static void main(String[] args){

        Scanner SC = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Daintree");
        while(running == true){
            PrintMainUI();
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
}