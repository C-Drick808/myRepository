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
        System.out.print("Enter your grade in Filipino: ");
        float subjFilipino = sc.nextFloat();
        System.out.print("Enter your grade in Araling Panlipunan: ");
        float subjAP = sc.nextFloat();
        System.out.print("Enter your grade in M.A.P.E.H: ");
        float subMAPEH = sc.nextFloat();
        double grades = (subjMath + subjEnglish + subjScience +
                subjFilipino + subjAP + subMAPEH) / 6;
        float rndOff = Math.round(grades);
        int finalGrades = (int) rndOff;
        System.out.println("\n • Average Grade: " + finalGrades);
        if (finalGrades >= 90){
            System.out.println(" Your grade average " + finalGrades + " is A+ Grade");
        }else if (finalGrades >= 80){
            System.out.println(" Your grade average " + finalGrades + " is B+ Grade");
        } else if (finalGrades >= 70) {
            System.out.println(" Your grade average " + finalGrades + " is C- Grade");
        } else if (finalGrades >= 60) {
            System.out.println(" Your grade average " + finalGrades + " is D Grade");
        } else{
            System.out.println(" Your grade average " + finalGrades + " is F Grade");
        }
    }
}
