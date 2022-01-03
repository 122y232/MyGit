
public class polymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayobject(new Circle(1,"red",false));
		displayobject(new Rectangle(1,1,"black",true));

	}
public static void displayobject(geometricobject object) {
	System.out.println("created on"+object.getDateCreated()+"color is"+object.getColor());
}
}
