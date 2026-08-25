
class QuotePrinter {
    void printQuote() {
        System.out.println("The only limits to our reailization of tommorow is our doubts of today.");
    }
}

public class Anonymous_Object_2 {
    public static void main(String[] args) {
        new QuotePrinter().printQuote(); // Calling the printQuote method of QuotePrinter class using anonymous object
                                         // without any reference.
    }
}