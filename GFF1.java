import java.util.Scanner;

public class GFF1 {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = mm.nextLine();         System.out.println("enter your age");
        int age = Integer.parseInt(mm.nextLine());
        if (age>18){
            System.out.println("Hello, " + name + "! and your age is " + age +"your are aadult");
        }
        else {
            System.out.println("Hello, " + name + "! and your age is " + age );
        }

    }
}
