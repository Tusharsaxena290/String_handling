
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.print("index:");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(i );

        }

        System.out.print("\nchars:");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) );
        }
    }
}





