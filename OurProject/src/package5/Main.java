package package5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		/* Method overloading
		 * same method name in same class but different parameter
		 */
		Student s1 = new Student();
		int a = s1.add(3, 4);
		int b = s1.add(2, 9,7);
		
		/* here add is a overloading method
		 * their name is same but their parameter or argument is not same
		 */
		
		System.out.println("Sum of 3 and 4 is      : "+a);
		System.out.println("Sum of 2 , 9  and 7 is : "+b);
		
		
		s1.name="Sabbir Mia";
		s1.roll=8;
		s1.age=24;
		s1.show();
		s1.roll=22;
		s1.show("Mahadi");
		
		/* here show is an overloading method
		 * but their parameter is different
		 */
		

	}

}
