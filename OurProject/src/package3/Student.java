package package3;

public class Student {
	Student()
	{
		System.out.println("This is a non parameterize Constructor of Student class.");
	}
	Student(String name, int age)
	{
		System.out.println("This is a parameterize Constructor of Student class.");
		System.out.println("Name : "+name+"\nAge  : "+age);
	}

}
