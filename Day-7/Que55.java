import java.util.Scanner;
 class Que55 {
   public static void main(String[] args) {
      String upper_case_line = "";

      String str = "ashish sarjerao patil.";

      Scanner lineScan = new Scanner(str);

      while(lineScan.hasNext()) {

         String word = lineScan.next();
         upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
      }
      System.out.println(upper_case_line);
   }
}