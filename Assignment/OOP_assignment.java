public class OOP_assignment {
    public static void main(String[] args) {

        // Student s1 = new Student("Manoj", 22, 22, 98.4);
        // System.out.println("\nStudent 1 Details: ");
        // s1.displayDetails();

        // Car c2 = new Car("Toyota", "Fortuner", 2012, "Desiel");
        // c1.display();

    }

    // CLASS 1
    static class Student {
        String name;
        int rollNo;
        int age;
        double marks;

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Age: " + age);
            System.out.println("Marks : " + marks);

        }

        Student(String name, int rollNo, int age, double marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.age = age;
            this.marks = marks;
        }

    }

    // CLASS 2
    static class Car {
        String brand;
        String model;
        int year;
        String fuelType;

        Car(String brand, String model, int year, String fuelType) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.fuelType = fuelType;
        }

        void display() {
            System.out.println("Brand Name: " + brand);
            System.out.println("Model Name: " + model);
            System.out.println("Year: " + year);
            System.out.println("Fuel Type:  " + fuelType);
        }
    }

}