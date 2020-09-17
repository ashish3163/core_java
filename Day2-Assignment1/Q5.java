import java.util.Scanner;

class Q5{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("username: ");
    String uname = input.next();
    
    System.out.println();
    System.out.println("Welcome"+uname);
  }
}