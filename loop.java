
package OOP_with_java;
import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        int i,a,s=0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter Ten numbers:");
        for(i=0;i<10;i++)
        {
            a=in.nextInt();
            s=s+a;
        }
        System.out.println("Sum of the numbers is: %d" +s);
    }
    
}
