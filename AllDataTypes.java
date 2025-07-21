
import java.util.Scanner;

public class AllDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for each data type
        System.out.print("Enter a byte value: ");
        byte byteVal = sc.nextByte();

        System.out.print("Enter a short value: ");
        short shortVal = sc.nextShort();

        System.out.print("Enter an int value: ");
        int intVal = sc.nextInt();

        System.out.print("Enter a long value: ");
        long longVal = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatVal = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleVal = sc.nextDouble();

        System.out.print("Enter a char value: ");
        char charVal = sc.next().charAt(0);  // Read first character

        System.out.print("Enter a boolean value (true/false): ");
        boolean boolVal = sc.nextBoolean();

        System.out.print("Enter a string: ");
        sc.nextLine(); // Clear the buffer
        String strVal = sc.nextLine();

        // Output with type names
        System.out.println("\n--- Displaying Values with Types ---");
        System.out.println("byte (8-bit)       : " + byteVal);
        System.out.println("short (16-bit)     : " + shortVal);
        System.out.println("int (32-bit)       : " + intVal);
        System.out.println("long (64-bit)      : " + longVal);
        System.out.println("float (32-bit)     : " + floatVal);
        System.out.println("double (64-bit)    : " + doubleVal);
        System.out.println("char (16-bit)      : '" + charVal + "'");
        System.out.println("boolean (true/false): " + boolVal);
        System.out.println("String (object)    : \"" + strVal + "\"");

        sc.close();
    }
}
