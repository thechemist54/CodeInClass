import java.util.Scanner;

public class Example
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      String name;
      
      System.out.println("what is your name: ");
      
      name = in.nextLine();
      
      System.out.println("Hello " + name);
   }
}
