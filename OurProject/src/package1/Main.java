package package1;

public class Main {
public static void main(String[] args)
{
  /* Introducing to class
   * we have a class name student which has 4 field
   * now we will call it 
   */

	
	Student s1 = new Student();   // to create an object of student class 
	// s1 is an object of class of student
	
	s1.name="Mahadi hassan";
	s1.age=22;
	s1.roll=23;
	s1.dept="CSE";
	
	System.out.println("Studnet 1 : ");	
	System.out.println("Name : "+s1.name);
	System.out.println("Roll : "+s1.roll);	
	System.out.println("Age  : "+s1.age);	
	System.out.println("DEPT : "+s1.dept);
	
	
Student s2 = new Student();   // to create an object of student class 

//s2 is another object of class of student

	s2.name="Sabbir Mia";
	s2.age=22;
	s2.roll=17;
	s2.dept="CSE";
	
	System.out.println("Studnet 2 : ");	
	System.out.println("Name : "+s2.name);
	System.out.println("Roll : "+s2.roll);	
	System.out.println("Age  : "+s2.age);	
	System.out.println("DEPT : "+s2.dept);
}
}
