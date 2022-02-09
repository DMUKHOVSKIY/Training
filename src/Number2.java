import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        String []lst = str.split(" ");
        int a=Integer.parseInt(lst[0]);
        int b=Integer.parseInt(lst[1]);
        int c=Integer.parseInt(lst[2]);

       if(a<b+c&&b<a+c&&c<a+b)
          System.out.println("Exist!");
       else
           System.out.println("Not exist");
    }
}
