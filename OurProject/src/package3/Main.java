package package3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Introducing to Constructor 
		 * it is a special type of method
		 * it can't be return type not even void 
		 * it cannot override,inherit,static,final,abstract,synchronize
		 * constructor name must be same as class
		 * it is not necessary to declare a constructor 
		 * java compiler use a default constructor
		 */
		Student s1 = new Student(); // non parameterize constructor 	
		Student s2 = new Student("Sabbir Mia",23); // parameterize constructor
		
	}

}
