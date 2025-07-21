import java.util.*;
public class arithmetic {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("write the value of A: ");
        int a= Integer.parseInt(mm.nextLine());
        System.out.println("the value of 'B':");
        int b = Integer.parseInt(mm.nextLine());


        // Arithmetic operations
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // Relational operations
        System.out.println("Relational Operations:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // Logical operations
        boolean x = true, y = false;
        System.out.println("Logical Operations:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // Bitwise operations
        System.out.println("Bitwise Operations:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println();

        // Assignment operations
        System.out.println("Assignment Operations:");
        int c = a;
        System.out.println("c = " + c);
        c += b;
        System.out.println("c += b -> " + c);
        c -= b;
        System.out.println("c -= b -> " + c);
        c *= b;
        System.out.println("c *= b -> " + c);
        c /= b;
        System.out.println("c /= b -> " + c);
        c %= b;
        System.out.println("c %= b -> " + c);
    }
}
