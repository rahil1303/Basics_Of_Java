import java.util.Scanner;

public class ElseIf2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > y){
            System.out.println(x + " is greater than " + y);
        }
        else if (x < y){
            System.out.println(y + " is greater than " + x);
        }
        else if (x == y){
            System.out.println(x + " is equal to " + y);
        }
        else{
            System.out.println("Please enter valid numbers...");
        }
    }
} 