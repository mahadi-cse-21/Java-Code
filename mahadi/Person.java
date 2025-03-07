package mahadi;

public class Person {
 private String name;
private int age;
public void setName(String name)
{
	this.name= name;
}
public void setage(int age)
{
	this.age = age;
}
public String getName()
{
	return name;
}
public int  getage()
{
	return age;
}
void show()
{
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
}
}
