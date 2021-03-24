import java.util.Scanner;

public class theBiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write first number: ");
        int firstnumber = input.nextInt();
        System.out.println("write second number: ");
        int secondnumber = input.nextInt();
        System.out.println("write third number: ");
        int thirdnumber = input.nextInt();
        if (firstnumber > secondnumber && firstnumber > thirdnumber)
            System.out.println("first number is the biggest number= "+firstnumber);
        else if (secondnumber > firstnumber && secondnumber > thirdnumber)
            System.out.println("second number is the biggest number= "+secondnumber);
        else System.out.println("third number is the biggest number= "+thirdnumber);
    }
}
