class Classroom {

    static int totalAttendance = 0; // static variable for tracking total attendance across all classrooms

    int classroomAttendance; // Non-static variable for tracking attendance in this specific classroom

    // Method to mark a student's attendance
    public void markAttendance() {
        classroomAttendance++; // This classroom's attendance
        totalAttendance++; // School-wide attendance
    }

    public void displayAttendance() {
        System.out.println("Attendance in this classroom: " + classroomAttendance);
        System.out.println("Total attendance in school: " + totalAttendance);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Classroom class101 = new Classroom();
        class101.markAttendance();
        class101.markAttendance();
        class101.displayAttendance(); // Class 101: 2, Total: 2

        Classroom class102 = new Classroom();
        class102.markAttendance();
        class102.markAttendance();
        class102.markAttendance();
        class102.displayAttendance(); // Class 102: 3, Total: 5
    }
}
