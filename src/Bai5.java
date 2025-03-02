import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Lỗi: Chiều dài và chiều rộng phải lớn hơn 0!");
            return;
        }
        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);
        sc.close();
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
    }
}
