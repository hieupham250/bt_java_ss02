import java.math.BigInteger;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên lớn thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập số nguyên lớn thứ hai: ");
        String str2 = scanner.nextLine();

        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);

        BigInteger sum = num1.add(num2);
        System.out.println("\nTổng: " + sum.toString());

        BigInteger difference = num1.subtract(num2);
        System.out.println("Hiệu: " + difference.toString());

        BigInteger product = num1.multiply(num2);
        System.out.println("Tích: " + product.toString());

        BigInteger quotient = (num2.equals(BigInteger.ZERO)) ? BigInteger.ZERO : num1.divide(num2);
        System.out.println("Thương: " + quotient.toString());

        System.out.print("\nNhập số mũ nguyên lớn: ");
        String exponentStr = scanner.nextLine();
        BigInteger exponent = new BigInteger(exponentStr);
        BigInteger power = num1.pow(exponent.intValue());
        System.out.println("Lũy thừa: " + power.toString());

        BigInteger modulo = (num2.equals(BigInteger.ZERO)) ? BigInteger.ZERO : num1.mod(num2);
        System.out.println("Số dư: " + modulo.toString());

        scanner.close();
    }
}
