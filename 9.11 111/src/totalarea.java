
public class totalarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle[] circleArray;
		circleArray=createcircleArray();
		printcircleArray(circleArry);
		

	}
public static circle[] createcircleArray() {
	circle[] circleArray = new circle[5];
	for(int i=0;i<circleArray.length;i++) {
		circleArray[i]=new circle(math.random()*100);
	}
	return circleArray;
}
public static void printcircleArray(circle[] circleArray) {
	System.out.printf("%-30s%-15s\n","radius","area");
	for (int i=0;i<circleArray.length;i++) {
		System.out.println("%-30f%-15f\n",circleArray[i].getradius(),circleArray[i].getarea());
	}
	System.out.printf("%-30s%-15f\n","The total area of circles is", sum(circleArray));
	
	
}
public static double sum(circle[] circleArray) {
	double sum=0;
	for (int i=0;i<circleArray.length;i++)
		sum+=circleArray[i].getarea();
	return sum;
}
}
