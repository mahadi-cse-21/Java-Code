package class7;

 public class Student extends Dept{
final String  name = "MAHADI";
final int age ;
static final String hometown;
Student(){
	age=20;}
	static {
		hometown = "DHAKA";
}
	void  bsmru()
	{
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("HOME TOWN: "+hometown);
		
	}

}
