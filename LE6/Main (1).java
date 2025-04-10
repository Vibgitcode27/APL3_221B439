public class Main
{
	public static void main(String[] args) {
	    Offering obj = new Tea();
	    Rum rum = new Rum(obj);
	    System.out.println(rum.getName());
	    System.out.println(rum.getPrice());
	}
}
