package circle;

public class Testcirclewithprivatedatefields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle mycircle=new circle(5.0);
		System.out.println("The area of the circle of radius"+mycircle.getradius()+"is"+mycircle.getarea());
		mycircle.setradius(mycircle.getradius()*1.1);
		System.out.println("The area of the circle of radius"+mycircle.getradius()+"is"+mycircle.getarea());
		System.out.println("The number of objects created is"+circle.getnumberofobjects());

	}

}
