package Task121;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask(12, 28, 2004);
        System.out.println(date1);
        System.out.println(date2);
       // display leap years
        DateTask showLeapYears = new DateTask();
        showLeapYears.leapYears();
       
    }
}
