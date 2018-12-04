import java.util.Scanner;

public class FiveNumberSum10 {

    public static void main (String[]args){

        int m,n, sum =0;
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the number:");
        m= obj.nextInt(); //storing input value in
        while (m>0){
            n =m %10;
            sum= sum+n;
            m =m /10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}
