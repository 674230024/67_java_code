import java.util.Scanner; // นำเข้าคลาส Scanner จาก package java.util
public class W04_01_AreaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์คลาส Scanner
        System.out.print("ป้อนค่ารัศมีวงกลม: "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radius

        // double radius;  // ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 10;    // กำหนดค่ารัศมีเป็น 10

        double area;    // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศคา่คงที่ PI
    if(rediur > 0){

    } else {
    }
        area = PI*radius*radius;  // คำนานหาพื้นที่ของวงกลม
        System.out.print("พื้นที่ของวงกลมที่มีรัศมีเท่ากับ ="+radius+"คือ"+area);

    }
}