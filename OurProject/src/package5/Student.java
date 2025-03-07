package package5;

public class Student {
	String name;
	int roll ;
	int age;
	
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
   void show()
       {
	   System.out.println("Name : "+name+"\nRoll : "+roll+"\nAge  : "+age);
       }
   void show(String name)
   {
   System.out.println("Name : "+name+"\nRoll : "+roll+"\nAge  : "+age);
   }
}
