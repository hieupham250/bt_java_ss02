public class Bai4 {
    public static void main(String[] args) {
        Boolean a = true, b = true, c = false;
        String result = "";
        result = (a && b) ? "Cả hai đều đúng" : "";
        System.out.println(result);

        result = (a || b) ? "Ít nhất một đúng" : "";
        System.out.println(result);

        result = (a == false && b == true) ? "Không đúng" : "";
        System.out.println(result);

        result = c ? "" : "c là false";
        System.out.println(result);

        result = !c ? "c là true" : "";
        System.out.println(result);
    }
}
