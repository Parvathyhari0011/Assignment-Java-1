package encapsulation;

public class Student {
	
	//bean class
	
	private String name;
	private int id;
	public Student() {
		super();
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//set & get write & read
	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	
//	public String getName()
//	{
//		return name;
//	}
//	public void setId(int id)
//	{
//		this.id=id;
//	}
//	
//	public int getId()
//	{
//		return id;
//	}
//	public Student() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Student(String name,int id) {
//		this.name=name;
//		this.id=id;
//	}

}
