import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        System.out.println("Input 2 numbers");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] list = str.split(" ");
        if (Double.parseDouble(list[0]) > Double.parseDouble(list[1]))
            System.out.println("Biggest number=" + list[0]);
        else
            System.out.println("Biggest number=" + list[1]);


    }
}
