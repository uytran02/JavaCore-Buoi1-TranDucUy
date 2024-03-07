import java.util.Scanner;

public class Bai2_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Mời nhập chiều dài hình chữ nhật: ");
        float length = sc.nextFloat();
        System.out.print("Mời nhập chiều rộng hình chữ nhật: ");
        float width = sc.nextFloat();
        float perimeter = (length + width)*2;
        float area = length * width;
        System.out.println("Chu vi hình chữ nhật là: " + perimeter + " đơn vị độ dài");
        System.out.print("Diện tích hình chữ nhật là: " + area + " đơn vị diện tích");
    }
}
