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

	void show2()
	{
		show();
		System.out.println("Roll: "+roll);
	}
	

}
