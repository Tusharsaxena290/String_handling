import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String b = in.nextLine().trim();
        System.out.println("enter the character");
        char a = in.next().charAt(0);
        System.out.println(b.indexOf(a));
    }
}