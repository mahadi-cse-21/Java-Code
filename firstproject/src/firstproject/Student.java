package firstproject;

public class Student {

int roll;
String name;

Student(String a, int r)
{ 
	name = a;
	roll = r;
}
Student()
{
	System.out.println(" default constractor");
}
void showInfo()
{
	System.out.println(" "+name+" "+roll);
}
}
