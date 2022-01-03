package circle;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle circle1=new circle();
		System.out.println("The area of the circle of radius"+circle1.radius+"is"+circle1.getarea());
		circle circle2=new circle(25);
		System.out.println("The area of the circle of radius"+circle2.radius+"is"+circle2.getarea());
		circle circle3=new circle(125);
		System.out.println("The area of the circle of radius"+circle3.radius+"is"+circle3.getarea());
		circle2.radius=100;
		System.out.println("The area of the circle of radius"+circle2.radius+"is"+circle2.getarea());

	}


double radius;
circle(){
	radius=1;
}
circle(double newradius){
	radius=newradius;
}
double getarea(){
	return radius*radius*Math.PI;
	
}
double getperimeter() {
	return 2*radius*Math.PI;
}
void setradius(double newradius) {
	radius=newradius;
}
}
