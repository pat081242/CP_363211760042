package lab2;

import java.util.Scanner;

public class example_Swetch_case {
    public static void main (String[] args) {
        // swtich-case นิยมใช้กับตัวแปรชนิด int หรือ char
        Scanner sc = new Scanner(System.in);
        System.out.println("What your favorite food?:");
        System.out.println("1.KFC");
        System.out.println("2.Pizza");
        System.out.println("3.MK");
        System.out.println("Selecy(1-3):");
        int s = sc.nextInt();
        //test variable
        switch (s) {
            case 1:
                System.out.println("I love KFC too.");
                break;
            case 2:
                System.out.println("I getting fat because I ate pizza a lot.");
                break;
            case 3:
                System.out.println("I getting fat because I ate pizza a lot.");
                break;
            default:
                System.out.print("Please' select1-3");
        }
        System.out.println("Good bye");
    }

