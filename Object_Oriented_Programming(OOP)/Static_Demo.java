class StaticDemo {

    // static variable
    static int x = 100;

    // static method
    public static void fun1() {
        System.out.println("Static method is executing");
    }

    // non-static variable
    int y = 200;

    // non-static method
    public void fun2() {
        System.out.println("Non-Static method is executing");
    }
}

public class Static_Demo {
    public static void main(String[] args) {

        // Accessing static components
        System.out.println("x = " + StaticDemo.x); // Directly using class name
        StaticDemo.fun1(); // No object needed

        // Accessing non-static components
        StaticDemo sd = new StaticDemo(); // Creating object
        System.out.println("y = " + sd.y); // Using object reference
        sd.fun2(); // Calling non-static method
    }
}
