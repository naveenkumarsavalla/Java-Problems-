import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x = Scanner.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
