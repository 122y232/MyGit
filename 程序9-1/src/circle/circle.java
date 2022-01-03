package circle;

public class circle {
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
