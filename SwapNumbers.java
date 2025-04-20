import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = Number.nextInt();
        System.out.println("Enter Second Number:");
        int b = Number.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}



