import java.util.Scanner;

public class sumOfOddAndAmongNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;

        }
        Scanner input=new Scanner(System.in);
        System.out.println("write a number to find odd numbers: ");
        int oddnumbers=input.nextInt();
        int sum1=0;
        for (int i = 1; i <oddnumbers ; i++) {
            if(i%2==1) sum1+=i;

        }
        int sum2=0;
        for (int i = 1; i <oddnumbers ; i=i+2) {
            sum2+=i;

        }
        System.out.println("1-"+oddnumbers+" sum of odd numbers="+sum2);
        System.out.println("1-"+oddnumbers+" sum of odd numbers="+sum1);
        System.out.println("sum among 0 and 100="+sum);
    }
}
