import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1 :");
        int num1 = in.nextInt();
        System.out.print("Enter Number2 :");
        int num2 = in.nextInt();
        System.out.print("Enter Number3 :");
        int num3 = in.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("num1 is Largest Number" +num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is Largest Number" + num2);
        }
        else {
            System.out.println("num3 is Largest Number" + num3);
        }

    }
}
