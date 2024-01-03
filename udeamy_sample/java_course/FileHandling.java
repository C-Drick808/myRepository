package udeamy_sample.java_course;
import java.io.*;

public class FileHandling {

   public static void main(String[] args) throws IOException {

      
      FileInputStream fileIn = null;
      FileOutputStream fileOut = null;
      try{

         fileIn = new FileInputStream("Sample.txt");
         fileOut = new FileOutputStream("SampleCopy.txt");

         int c; 
         while((c = fileIn.read()) != -1){
            fileOut.write((char) c);
         }
         System.out.println("Writting of SampleCopy.txt is complete");
      }catch(FileNotFoundException e){
         System.out.println("Invalid file-name");
      }finally{
         if(fileIn != null)
            fileIn.close();
         if(fileOut != null)
            fileOut.close();
      }
      

      
   }
   
}
