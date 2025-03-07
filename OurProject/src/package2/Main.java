package package2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Introducing to Method 
		 * void type , return type
		 * parameterize
		 * non parameterize
		 */
		Student s2 = new Student();		
		s2.name="Sabbir Mia";
		s2.age=22;
		s2.roll=17;
		s2.dept="CSE";		
		s2.display(); 		
		/* here display is a method of  Student class 
		 * which will show the name ,roll , age ,dept of an object
		 * this is a void type non parameterize method
		 */		
		Arithmetic a1 = new Arithmetic();	
		a1.show(5,9); // show is a void type parameterize Method	
        Arithmetic a2 = new Arithmetic();	
		int result =  a2.show2(5,9); // show2 is a int return type parameterize Method		
		System.out.println("Sum of 5 + 9 : "+result);	
        Arithmetic a3 = new Arithmetic();		
		int res2 = a3.show3(5, 9 , 6); // show is a int return  type parameterize Method
	    System.out.println("Sum of 5 + 9 + 6 : "+res2);
	}
}
