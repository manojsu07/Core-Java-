public class InstanceBlock {
    String title;
    int edition;

    // Instance Block
    {
        System.out.println("Initializing a new instance of book");
        edition = 1;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Edition: " + edition);
    }

    public static void main(String[] args) {
        InstanceBlock defaultBook = new InstanceBlock(); // Instance bloack executes 1st time
        defaultBook.displayInfo();

        InstanceBlock specificBook = new InstanceBlock(); // Instance block executes 2nd time
        specificBook.title = "Java Fundamental";
        specificBook.displayInfo();
    }
}
