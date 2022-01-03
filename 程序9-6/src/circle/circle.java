package circle;

public class circle {
	double radius;
	static int numberofobjects=0;
	circle(){
		radius=1;
		numberofobjects++;
	}
	circle(double newradius){
		radius=newradius;
		numberofobjects++;
	}
	static int getnumberofobjects() {
		return numberofobjects;
	}
	double getarea() {
		return radius*radius*Math.PI;
	}
}
