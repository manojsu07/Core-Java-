class Student {
    private int rollNumber; // Private members of class
    private String name;
    private int age;

    public void setRollNumber(int rollNum) { // Setter Methods
        rollNumber = rollNum;
    }

    public void setName(String stName) {
        name = stName;
    }

    public void setAge(int stAge) {
        age = stAge;
    }

    public int getRollNumber() { // Public Getter Methods
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        // Managing the data of Students
        Student student1 = new Student();
        student1.setRollNumber(101);
        student1.setName("Alice");
        student1.setAge(20);

        Student student2 = new Student();
        student2.setName("Alicia");
        student2.setAge(20);

        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Numebr: " + student1.getRollNumber());
        System.out.println("Age: " + student1.getAge());

        System.out.println("Name: " + student2.getName());
        System.out.println("Roll Numebr: " + student2.getRollNumber());
        System.out.println("Age: " + student2.getAge());

    }
}
