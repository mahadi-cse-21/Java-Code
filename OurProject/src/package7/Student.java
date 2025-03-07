package package7;

public class Student {
String name;
int roll;
int age;
static String dept;
static String faculty;
static String institution;
static int dept_no = 1; // this is static variable

// following block is a static block 
static {
	dept="CSE";
	faculty="Engineering";
	institution = "BSMRU";
}
void show()
{
	
	System.out.println("Name : "+name);
	System.out.println("Roll : "+roll);
	System.out.println("Age  : "+age);
	System.out.println("DEPT  : "+dept);
	System.out.println("Dept no : "+dept_no+"\nFaculty : "+faculty);
    System.out.println("Institution : "+institution);
}

}
