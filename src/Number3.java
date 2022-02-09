import java.util.Scanner;

public class Number3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();;
        if(x==0)
            x=10;
        else if(x%2==0)
            x++;
        else
            x=x-2;
        System.out.println(x);
    }
}
