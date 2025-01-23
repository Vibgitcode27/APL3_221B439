public class Two extends One {
    
    public Two(int x) {
        super(x);
    }
    
    public void display() {
        System.out.println("Value of x in class Two: " + x);
    }
    
    public static void main(String[] args) {
        Two obj = new Two(10);
        obj.display();
    }
}
