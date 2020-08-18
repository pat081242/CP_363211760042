package lab2;

import java.util.Scanner;
import java.util.stream.Stream;

//รับค่าจำนวนเต็มจากผู้ใช้ เมื่อผู่ใช้ใส้ค่า 0 ให้จบการทำงาน (while)
public class example_While {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num =1;

        while (num !=0) {
            System.out.println("Enter integer : ");
            num = sc.nextByte();
        }
    System.out.println("End Good Bye.");
    }

}
