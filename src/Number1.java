import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        System.out.println("Enter integer value: ");
        Scanner scan = new Scanner(System.in);
        String str_x = scan.next();

        int i = 0;
        Integer x = Integer.parseInt(str_x);
        while (x != 0) {
            int c = x % 10;
            x = x / 10;
            i++;
        }
        System.out.println(i);
    }
}
