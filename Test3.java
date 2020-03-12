import java.util.Scanner;
   public class Test3{
      public static void main (String [] args){
         Scanner sc = new Scanner (System.in);
      
      String a,b;
      
      System.out.print("Enter String 1:");
      a=sc.nextLine();
      System.out.print("Enter String 2:");
      b=sc.nextLine();
      if(a.equals(b))
         System.out.println("both string is equals");
         else
            System.out.println("the string are not the same ");
      
      
      }//end main
}//end class