package mahadi;

public class Student {

 String name;
 static String dept = "CSE";
 static int b=6;
 int roll;
 Student (String n, int r)
 {
	 name = n;
	 roll = r;
 }
 void show()
 {
	 System.out.println("Name: "+name);
	 System.out.println("Roll: "+roll);
	 System.out.println("Dept: "+dept);
 }
void display()
{
	display1();
	System.out.println("non static method");
}
static void display1()
{
	System.out.println(""+b);
	System.out.println("static method");
}
static int roll1 = 4;
static String dept1;
static
{

    dept1="CSE";
    System.out.println("static method "+roll1);
}
Student()
{
	roll1=roll1+1;
}
void show1()
{
	System.out.println(" Roll : "+roll1);
}
}


