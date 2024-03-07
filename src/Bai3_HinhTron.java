import java.util.Scanner;
public class Bai3_HinhTron {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc= new Scanner(System.in);
        System.out.print("Mời nhập bán kính đường tròn: ");
        float radius = sc.nextFloat();
        double perimeter = 2*PI*radius;
        System.out.print("Chu vi đường tròn là: ");
        System.out.printf(" %-10.2f", perimeter );
        double area = PI*radius*radius;
        System.out.println("");
        System.out.print("Diện tích đường tròn là: ");
        System.out.printf(" %-10.2f", area );

    }
}
