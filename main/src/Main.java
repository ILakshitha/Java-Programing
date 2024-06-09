import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        Scanner name =  new Scanner(System.in);


        System.out.println("What is your name?");
        String x = name.nextLine();
        System.out.println(x);

        int y = name.nextInt();

        System.out.println(y);



    }
}