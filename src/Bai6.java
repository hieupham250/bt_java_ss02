import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học sinh:");
        String name = sc.nextLine();
        System.out.println("Nhập điểm môn 1:");
        double point1 = sc.nextDouble();
        System.out.println("Nhập điểm môn 2:");
        double point2 = sc.nextDouble();
        System.out.println("Nhập điểm môn 3:");
        double point3 = sc.nextDouble();

        double sumPoint = point1 + point2 + point3;
        double averageScore = sumPoint / 3;
        String rating;

        rating = averageScore < 5 ? "Yếu" : averageScore >= 5 && averageScore <= 6.5 ? "Trung Bình" : averageScore >= 6.5 && averageScore <= 8 ? "Khá" : "Giỏi";

        System.out.println("Tên: " + name + ", điểm trung bình " + String.format("%.2f", averageScore) + ",xếp hạng " + rating);
    }
}
