package abstraction;

public class SBI extends Bank{

	void run() {
System.out.println("Running...");		
	}
public static void main(String[] args) {
//	Bank b1=new Bank(); 
	SBI s1=new SBI();
	s1.run();
	s1.printValue();
	Bank b2=new SBI();
	b2.run();
	b2.printValue();
}
}
