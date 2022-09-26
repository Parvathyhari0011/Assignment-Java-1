package encapsulation;

public class TestStudent {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setName("Sreelakshmi");
	s1.setId(101);
	System.out.println(s1.getId()+" "+s1.getName());
	Student s2=new Student("Anu",102);
	System.out.println(s2.getId()+" "+s2.getName());
	
}
}
