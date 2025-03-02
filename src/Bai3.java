public class Bai3 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        Boolean bangNhau = x == y;
        Boolean khacNhau = x != y;
        Boolean lonhon = x > y;
        Boolean nhoHon = x < y;
        Boolean lonHonHoacBang = x >= y;
        Boolean nhoHonHoacBang = x <= y;

        if(bangNhau) {
            System.out.println("x bằng y");
        }
        if(khacNhau) {
            System.out.println("x khác y");
        }
        if(lonhon) {
            System.out.println("x lớn hơn y");
        }
        if(nhoHon) {
            System.out.println("x nhỏ hơn y");
        }
        if(lonHonHoacBang) {
            System.out.println("x lớn hơn hoặc bằng y");
        }
        if(nhoHonHoacBang) {
            System.out.println("x nho hơn hoặc bằng y");
        }
    }
}
