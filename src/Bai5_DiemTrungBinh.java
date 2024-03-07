import java.util.Scanner;

public class Bai5_DiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Mời nhập điểm Toán: ");
        float mathScore = sc.nextFloat();
        System.out.print("Mời nhập điểm Văn: ");
        float literatureScore = sc.nextFloat();
        System.out.print("Mời nhập điểm Tiếng Anh: ");
        float englishScore = sc.nextFloat();
        float averageScore = (mathScore + literatureScore + englishScore)/3;
        System.out.print("Điểm trung bình 3 môn là: ");
        System.out.printf("%-5.2f", averageScore);
    }
}
