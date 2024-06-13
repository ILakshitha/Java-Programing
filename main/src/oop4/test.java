package oop4;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number :");
        a=sc.nextInt();
        System.out.print("Enter the second number :");
        b=sc.nextInt();

        try{
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);

        }
        finally {
            System.out.println("bye");
        }

    }
}
