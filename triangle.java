package shape;

public class triangle {

    public static void main(String[] args) {
        double a = 13.211, b = 16.222, c = 15.051;

        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("Đây là tam giác !");
        }
        if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Đây là tam giác cân !");
        } else if ((a == b) && (b == c) && (c == a)) {
            System.out.println("Đây là tam giác đều !");
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
            System.out.println("Đây là tam giác vuông !");
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }
}