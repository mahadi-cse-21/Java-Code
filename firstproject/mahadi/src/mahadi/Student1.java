package mahadi;

public class Student1 extends Person {
private	int roll;
public void setRoll(int roll)
{
	this.roll = roll;
}
public int  getRoll()
{
	return roll;
}

	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Roll: "+roll);
	}
	

}
