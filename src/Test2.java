import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(s);
        System.out.println(s.substring(a,b));
    }
}