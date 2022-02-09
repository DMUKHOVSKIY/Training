import java.util.Scanner;

public class Number4{
    public static void main(String[] args) {
        System.out.println("Input 3 integers");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] line = str.split(" ");

        int posNum = 0;
        for (int i = 0; i < line.length; i++) {
            if (Integer.parseInt(line[i]) > 0)
                posNum++;
        }
        System.out.println("number of positive numbers=" + posNum);
    }
}
