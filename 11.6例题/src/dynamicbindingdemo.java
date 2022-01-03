
public class dynamicbindingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new graduatestudent());
		m(new student());
		m(new person());
		m(new Object());
	}
		public static void m(Object x) {
			System.out.println(x.toString());
		}
	}
	class graduatestudent extends student{
	}
	class student extends person{
		@Override
		public String toString() {
			return "student";
		}
	}
	class person extends Object{
		@Override
		public String toString() {
			return "person";
		}
	}


