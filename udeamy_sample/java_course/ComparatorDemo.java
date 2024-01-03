package udeamy_sample.java_course;
import java.util.ArrayList;
import java.util.Comparator;

class StringCompare implements Comparator<String>{
   @Override
   public int compare(String str1, String str2){
      return str1.compareTo(str2);
   }
}

public class ComparatorDemo {
   public static void main(String[] args) {
      
      ArrayList<String> cityList = new ArrayList<>();

      //Add item in the array list
      cityList.add("Delhi");
      cityList.add("Kolkata");
      cityList.add("Hyderabad");
      cityList.add("Chennai");
      cityList.add("Lucknow");

      System.out.println("Cities Unsorted: " + cityList);

      //sort the array list in alphabetical order
      cityList.sort(new StringCompare());

      System.out.println("Cities Sorted" + cityList);
   }
   
}
