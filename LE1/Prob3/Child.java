public class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Child's show() method");
    }

    // Static method
    public static void staticShow() {
        System.out.println("Child's staticShow() method");
    }
}
