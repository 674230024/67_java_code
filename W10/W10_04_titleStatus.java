package W10;
import java.util.Scanner;
public class W10_04_titleStatus {
     public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("ระบุเพศ (male/female): ");
        String gender = kb.next();
        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();
        System.out.print("สถานะสมรส (single/married): ");
        String isMarried = kb.next();

        if (gender.equalsIgnoreCase("male")) {
           // ถ้าเป็นผู้ชาย => ด.ช. นาย
            if(age < 15){
               System.out.println("ด.ช.");
            }else{
                System.out.println("นาย");
             }
        }else{
            // ถ้าเป้นผู้หญิง => ด.ญ. นางสาว นาง
            if(age < 15){
               System.out.println("ด.ญ.");
            }else if(isMarried.equalsIgnoreCase("isMarried")){ 
                System.out.println("นาง");
            }else{   
                System.out.println("นางสาว");
            }   
       }
    }
}