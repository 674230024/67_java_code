import java.util.Scanner; // นำเข้าคลาส Scanner จาก package java.util

public class Week04_Homework_ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีของวงกลม: "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radius

        double area; // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI

        if (radius > 0) {
            area = PI * radius * radius; // คำนวนพื้นที่ของวงกลม
            System.out.println("พื้นที่ของวงกลมที่มีรัศมี " + radius + " คือ " + area);
        } else {
            System.out.println("รัศมีต้องมีค่ามากกว่า 0");
        }
    }
}