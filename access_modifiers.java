
class access_modifiers {

    public int publicValue = 10;
    private int privateValue = 20;
    protected int protectedValue = 30;
    int defaultValue = 40;

    public void showValues() {
        System.out.println("--- Inside access_modifiers ---");
        System.out.println("publicValue    = " + publicValue);
        System.out.println("privateValue   = " + privateValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue   = " + defaultValue);
    }
    static class SubClass extends access_modifiers {
        void display() {
            System.out.println("--- Inside SubClass ---");
            System.out.println("Accessing publicValue    = " + publicValue);
           // System.out.println("Accessing privateValue = " + privateValue); //  Not accessible
            System.out.println("Accessing protectedValue = " + protectedValue);
            System.out.println("Accessing defaultValue   = " + defaultValue);
        }
    }

    // === Another class in the same file ===
    static class OtherClass {
        void display() {
            access_modifiers obj = new access_modifiers();
            System.out.println("--- Inside OtherClass ---");
            System.out.println("Accessing publicValue    = " + obj.publicValue);
            // System.out.println("Accessing privateValue = " + obj.privateValue); // ❌ Not accessible
            System.out.println("Accessing protectedValue = " + obj.protectedValue);
            System.out.println("Accessing defaultValue   = " + obj.defaultValue);
        }
    }

    // === Main Method ===
    public static void main(String[] args) {
        access_modifiers obj = new access_modifiers();
        obj.showValues();

        SubClass sub = new SubClass();
        sub.display();

        OtherClass other = new OtherClass();
        other.display();
    }
}
