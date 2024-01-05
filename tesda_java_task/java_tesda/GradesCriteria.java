package java_tesda;
import java.util.Scanner;
import java.lang.Math;
public class GradesCriteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t // Student Grades Criteria //\n\n");
        System.out.print("Enter your grade in Math: ");
        float subjMath = sc.nextFloat();
        System.out.print("Enter your grade in English: ");
        float subjEnglish = sc.nextFloat();
        System.out.print("Enter your grade in Science: ");
        float subjScience = sc.nextFloat();
        double grades = (subjMath + subjEnglish + subjScience) / 3;
        float rndOff = Math.round(grades);
        int finalGrades = (int) rndOff;
        System.out.println("\n • Final Grade: " + finalGrades);
        if (finalGrades >= 90){
            System.out.println("Grade A");
        }else if (finalGrades >= 80){
            System.out.println("Grade B");
        } else if (finalGrades >= 70) {
            System.out.println("Grade C");
        } else if (finalGrades >= 60) {
            System.out.println("Grade D");
        } else{
            System.out.println("Grade F");
        }
    }
}
