import java.util.Scanner;

public class Bai7_4ChuSo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Mời nhập vào một số có 4 chữ số: ");
        int number = sc.nextInt();
        if(number>999 && number<10000){
            int num1 = number/1000; //hàng nghìn
            int num1res = number%1000; //lấy phần dư
            int num2 = num1res/100; //Hàng trăm
            int num2res = num1res%100;
            int num3 = num2res/10; //Hàng chuc
            int num4 = num2res%10;
            System.out.println("Tổng các chữ số của số vừa nhập là: "+ (num1+num2+num3+num4));
            System.out.println("Số nghịch đảo của số vừa nhập là: "+(num4*1000+num3*100+num2*10+num1));
    }else {
            System.out.println("Số bạn nhập không hợp lệ");}
    }
}
