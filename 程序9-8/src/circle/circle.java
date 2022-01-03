package circle;

public class circle {
	private double radius =1;
	private static int numberofobjects=0;
	public circle() {
		numberofobjects++;
	}
	public circle(double newradius) {
		radius=newradius;
		numberofobjects++;
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double newradius) {
		radius=(newradius>=0)?newradius:0;
	}
	public static int getnumberofobjects() {
		return numberofobjects;
	}
	public double getarea() {
		return radius*radius*Math.PI;
	}

}
