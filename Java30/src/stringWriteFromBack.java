import java.util.Scanner;

public class stringWriteFromBack {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a word: ");
        String word=input.next();
        for (int i=word.length()-1;i>=0 ; i--) {
            System.out.print(word.charAt(i));

        }
    }
}
