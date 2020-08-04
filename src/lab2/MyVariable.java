package lab2;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class MyVariable {
    public static void main(String[] args) {

   //integer จำนวนเต็ม  10 0 -10
        int x; //ประกาศตัวเเปรชื่อ x สำหรับเก็บข้อมูลจำนวนเต็ม
        x = 10;// กำหนดตัวเเปร x มีค่าเท่ากับ 10
        System.out.println(" x = " +x);
        int y = 20; // ประกาศตัวเเปรชื่อ y และกำหนดค่าให้เท่ากับ 20
        System.out.println("x+y= "+(x+y)); //x+y =30


        //resl munber จำนวนจริง เช่น 10.00 -555.36 78.21
        float F = 10.10f;
        System.out.println(F);
        double  d = 45.;//?
        System.out.println(d);


        //character ตัวอักษรเพียง ตัวเท่านั้น เช่น # $ % v A a
        char c = 'c';
        System.out.print(c);

        //boolean เก็บค่า trun (1) เเละ false (0)
        boolean b = true;
        System.out.println (b);
        System.out.println (!b);

        //string เป็นคราสภาษา Java ใช้สำหรับเก็บข้อมูบชนิด ข้อความ
        String s = "Management Technology";
        System.out.println(s);
        System.out.println(s.length());// คื่นค่ากลับมาเป็น จำนวนเต็ม
        System.out.println(s.toUpperCase()); //แปรอักขระเป็นพิมพ์ใหญ่
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(5));//



    }//main

}//class
