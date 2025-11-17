import java.util.Scanner;

public class SentinelSum
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      
      System.out.print("Please enter a number to average in or -1 to stop: ");
      int number = scan.nextInt();
      int sum = 0;
      sum = number + sum;      
      
      while (number != -1)
      {
         System.out.println("You entered " + number);
         System.out.println("Please enter another number or -1 to stop: ");
         number = scan.nextInt();
         if (number != -1)
            sum = number + sum;
                     
      }
      if (number == -1) {
         System.out.print("" + sum);
      }
         
   }      
}      