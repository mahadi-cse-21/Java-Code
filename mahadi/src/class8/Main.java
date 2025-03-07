package class8;

public class Main {

	public static void main(String[] args) {
		//    Polymorphism  
		Human h1 = new Human();
		h1.show();
	/*    Student s1=new Student();
	    *  Teacher t1 = new Teacher();
	    *  s1.show();
	    *  t1.show();    */
		h1=new Student();
		h1.show();
		h1=new Teacher();
		h1.show();
		

	}

}
