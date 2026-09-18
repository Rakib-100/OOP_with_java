package OOP_with_java;

import java.util.Scanner;

public class vote {
    public static void main(String[] args){
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        a=in.nextInt();
        if(a>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
    
}
