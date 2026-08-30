public class StaticBlock {

    // Static varibales
    static int defaultAssginment;
    static String classRoomRules;

    // Stati block
    static {
        System.out.println("Stting up the class room ");
        defaultAssginment = 10;
        classRoomRules = "Respect Others, keep room clean, do assignments";
    }

    public static void displayClassroomSettings() {
        System.out.println("Classroom rules: " + classRoomRules);
        System.out.println("Default Assignments: " + defaultAssginment);
    }

    public static void main(String[] args) {
        StaticBlock.displayClassroomSettings();
    }
}
