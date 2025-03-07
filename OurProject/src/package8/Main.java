package package8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* keyword in java
		 * this
		 */
		
		Student s1 = new Student();
		s1.name="Sabbir";
		s1.age=4;
		s1.show(10);
		
		/* we use this key word inside the show method for roll 
		 * but  we send 10 as roll in show as argument but it remains unchanged 
		 * because we initialize the value of roll out of the method 'show'
		 */

	}

}
