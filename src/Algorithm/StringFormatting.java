package Algorithm;

public class StringFormatting {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        String studentName = "john smith";
        int studentId = 123;
        double mathGrade = 92.5555;
        double scienceGrade = 88.7777;
        double englishGrade = 95.1111;
        double attendance = 0.8523;

        // Create your formatted strings
        String[] line = studentName.split(" ");
        for (int i = 0; i < line.length; i++) {
            line[i] = line[i].substring(0,1).toUpperCase() + line[i].substring(1);
        }
        String result = String.join(" ", line);

        String headerInfo = String.format("Student: %s, ID: %05d", result, studentId);
        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f", mathGrade, scienceGrade, englishGrade);

        double attendanceFinal = attendance * 100;
        String attendanceInfo = String.format("Attendance: %.1f%%", attendanceFinal);

        // Don't modify the code below
        System.out.println("STUDENT REPORT CARD");
        System.out.println("------------------");
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
    }
}
