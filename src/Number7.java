import java.util.Scanner;

public class Number7 {
    public static void main(String args[]) {
        System.out.println("Input the number of programmers: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < 0)
            System.out.println("Input correct number!");
        else if (x % 10 == 1 && x % 100 != 11)
            System.out.println(x + " программист");
        else if (x % 10 > 1 && x % 10 < 5 && !(x % 100 > 11 && x % 100 < 15))
            System.out.println(x + " программиста");
        else
            System.out.println(x + " программистов");

    }
}
