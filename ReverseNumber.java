import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number=sc.nextInt();
//        int number = 12345678;
        int reverse = 0;
        while(number>0){
            int remainder = number%10; //12345678 % 10 = 8
            reverse = reverse*10+remainder; //8*10+7=87
            number=number/10; //12345678/10=1234567
        }
        System.out.println("REVERSE NUMBER :1234567" +reverse);
    }
}
