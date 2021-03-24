import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args) {


        int first, second, sum;
        float average;
        Scanner input = new Scanner(System.in);
        System.out.print("write first number: ");
        first = input.nextInt();
        System.out.print("write second number: ");
        second = input.nextInt();
        sum = first + second;
        average = (float) sum / 2;
        System.out.println("sum of numbers: " + sum);
        System.out.print("average of numbers: " + average);

    }
}
