package package10;

public class Child extends Parent {
	String name;
	int roll;
	void show()
	{
		
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
		System.out.println("Roll : "+this.roll);
		System.out.println("Father Name : "+super.name);
		super.show2();
	}

}
