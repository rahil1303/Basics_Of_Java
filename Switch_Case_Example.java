import java.util.Scanner;
public class Switch_Case_Example {

   public static void main(String[] args) {
       int n;
       String r = "";
       Scanner input= new Scanner(System.in);
       n=input.nextInt();
       
       switch (n) {
           case 1:
               r = "Hufflepuff";
               break;
           case 2:
               r = "Gryffindor";
               break;
           case 3:
               r = "Slytherin";
               break;
           case 4:
               r = "Ravenclaw";
               break;
           default:
               System.out.println("Enter a number from 1 to 4");
               break;
       }
       System.out.println(r);
       
   }
}
