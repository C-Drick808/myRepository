package java_tesda;

public class OddOrEvenTask {
    static int check_number = 10;

    public static void main(String[] args) {

        for (int i = 1; i<= 10; i++) {
            String message;
            check_number -= 1;
            if (i % 2 == 0) {
                message = "is ODD Number";
                System.out.println(i+" "+message);
            } else {
                message = "is EVEN Number";
                System.out.println(i+" "+message);
            }
        }
    }
}
