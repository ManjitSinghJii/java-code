// WAJP to add 3 numbers
import java.util.Scanner;
class Add_3_Number
{
    public static void main(String[] args)
    {
       Scanner scn = new Scanner(System.in);
       System.out.println("Entre the first number...");
       int num1=scn.nextInt();

       System.out.println("Entre the second number...");
       int num2=scn.nextInt();

       System.out.println("Entre the third number...");
       int num3=scn.nextInt();
       int result = num1+num2+num3;
       System.out.println("sum of three number is..."+result);
    }
}