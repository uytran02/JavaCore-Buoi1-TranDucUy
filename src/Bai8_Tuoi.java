import java.util.Calendar;
import java.util.Scanner;
public class Bai8_Tuoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào năm sinh của bạn: ");
        int yearOfBirth = sc.nextInt();
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int age = year-yearOfBirth;
        if(age%2==0){
            System.out.println("Năm nay bạn "+age+" tuổi, số tuổi chẵn");
        }else {
            System.out.println("Năm nay bạn "+age+" tuổi, số tuổi lẻ");
        }
    }
}
