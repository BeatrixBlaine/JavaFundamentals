package Algorithm;

public class CoddyJava {
    public static String getClassStats(int[] grades) {
        // Write your code here
        int temp = 0;
        for (int i = 0; i < grades.length; i++) {
            temp += grades[i];
        }
        double avg = (double) temp / grades.length;

        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        int passing = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 60) {
                passing++;
            }
        }

        return "Class Average: " + String.format("%.1f", avg) + "\nHighest Grade: " + max + "\nLowest Grade: " + min + "\nPassing Grades: " + passing + "/" + grades.length;
    }

    public static String getLetterGrades(int[] arr) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= 90) {
                countA++;
            } else if (arr[i] >= 80) {
                countB++;
            } else if (arr[i] >= 70) {
                countC++;
            } else if (arr[i] >= 60) {
                countD++;
            } else {
                countF++;
            }
        }

        return "A (90-100): " + countA + "\nB (80-89): " + countB + "\nC (70-79): " + countC + "\nD (60-69): " + countD + "\nF (0-59): " + countF;
    }

    public static String getImprovement(int[] start, int[] end) {

        if (start.length != end.length) {
            return null;
        }

        // Write your code here
        int temp = 0;
        for (int i = 0; i < start.length; i++) {
            if (start[i] < end[i]) {
                temp += end[i] - start[i];
            }
        }

        int[] temp1 = new int[start.length];
        for(int i = 0; i < start.length; i++) {
            temp1[i] = end[i] - start[i];
        }
        // get max
        int max = temp1[0];
        for(int i = 0; i < temp1.length; i++) {
            if (temp1[i] > max) {
                max = temp1[i];
            }
        }

        int improved = 0;
        for(int i = 0; i < temp1.length; i++) {
            if (temp1[i] > 0) {
                improved++;
            }
        }

        double avg = improved == 0 ? 0 : (double) temp / improved;

        return "Average Improvement: " + String.format("%.1f", avg) + " points" + "\nMost Improved: " + max + " points" + "\nStudents Improved: " + improved + "/" + start.length;

    }

    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};

        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));

        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));

        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}
