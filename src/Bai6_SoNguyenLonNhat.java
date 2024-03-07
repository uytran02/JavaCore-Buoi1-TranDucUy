import java.util.Scanner;

public class Bai6_SoNguyenLonNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Mời nhập số nguyên thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.print(" Mời nhập số nguyên thứ hai: ");
        int number2 = sc.nextInt();
        System.out.print(" Mời nhập số nguyên thứ ba: ");
        int number3 = sc.nextInt();
        int max;
        if(number1 > number2 && number1>number3){
            max= number1;
        } else if (number2>number1&&number2>number3) {
            max=number2;

        }else {max=number3;};
        System.out.println("Số lớn nhất trong 3 số là: " + max);
    }
}
