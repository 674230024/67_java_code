import java.util.Scanner;
public class W04_02_ifElse_compareNumber {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the first number: ");
       int num1 = input.nextInt();
       System.out.print("Enter the Second number: ");
       int num2 = input.nextInt();
       int result = 0;
       if(num1>num2) {
               result = num1-num2;
               System.out.print(" The Number 1 is greater than the Number2");
       } else {
               result = num1+num2;
               System.out.print(" The Number 1 is Less than or equal the Number2");
       }
       System.out.println("The result is: " + result);
    }
}