import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter scores for different subjects
        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println("Please enter the scores for the following subjects:");
        
        System.out.print("Math: ");
        int mathScore = scanner.nextInt();
        
        System.out.print("Science: ");
        int scienceScore = scanner.nextInt();
        
        System.out.print("English: ");
        int englishScore = scanner.nextInt();
        
        // Calculate the total score and average
        int totalScore = mathScore + scienceScore + englishScore;
        double averageScore = totalScore / 3.0;
        
        // Determine the grade based on the average score
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display the total score, average score, and grade
        System.out.println("\nTotal Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
        
        // Close the Scanner object
        scanner.close();
    }
}
