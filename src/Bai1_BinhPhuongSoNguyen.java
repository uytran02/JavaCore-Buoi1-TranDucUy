import java.util.Scanner;

public class Bai1_BinhPhuongSoNguyen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Mời nhập số nguyên bất kỳ: ");
        int number = sc.nextInt();
        System.out.print("Bình phương của số nguyên vừa nhập là: ");
        System.out.println(number*number);
    }
}
