package abstraction;

public class ChildCylinder implements Cylinder {
	public static void main(String[] args) {
		//Circle c1=new Circle(); 
		Circle c1=new ChildCircle();
		c1.run2();
		c1.run3();
		ChildCircle c2=new ChildCircle();
		c2.run2();
		c2.run3();
		Cylinder c3=new ChildCylinder();
	}

	@Override
	public void run2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run3() {
		// TODO Auto-generated method stub
		
	}

}
