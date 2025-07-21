
public class control_statement{

    public static void main(String[] args) {
        int number = 15;
        System.out.println("1. IF / ELSE / ELSE-IF:");
        if (number < 10) {
            System.out.println("  Number is less than 10");
        } else if (number == 10) {
            System.out.println("  Number is exactly 10");
        } else {
            System.out.println("  Number is greater than 10");
        }


        System.out.println("\n2. SWITCH Statement:");
        int day = 3;
        switch (day) {
            case 1: System.out.println("  Monday"); break;
            case 2: System.out.println("  Tuesday"); break;
            case 3: System.out.println("  Wednesday"); break;
            default: System.out.println("  Other day");
        }


        System.out.println("\n3. FOR Loop with BREAK:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("  Breaking at i = " + i);
                break;
            }
            System.out.println("  i = " + i);
        }


        System.out.println("\n4. WHILE Loop with CONTINUE:");
        int j = 0;
        while (j < 5) {
            j++;
            if (j == 3) {
                System.out.println("  Skipping j = " + j);
                continue;
            }
            System.out.println("  j = " + j);
        }


        System.out.println("\n5. DO-WHILE Loop:");
        int k = 0;
        do {
            System.out.println("  k = " + k);
            k++;
        } while (k < 3);


        System.out.println("\n6. FOR-EACH Loop:");
        int[] arr = {1, 2, 3, 4};
        for (int val : arr) {
            System.out.println("  Value: " + val);
        }


        System.out.println("\n7. RETURN Statement:");
        printStatus(-1);
    }


    static void printStatus(int status) {
        if (status < 0) {
            System.out.println("  Invalid status, exiting method early...");
            return; 
        }
        System.out.println("  Status is OK.");
    }
}
