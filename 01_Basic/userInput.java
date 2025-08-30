import java.util.Scanner;

public class userInput{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = s.nextInt();
        // System.out.println("Your age is "+age);

        int num1 = s.nextInt();
        long num2 = s.nextLong();
        int res = (int)(num1+num2);
        System.out.println(res);
    }
}