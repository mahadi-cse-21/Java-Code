package mahadi;

public class Stu extends Per {
	int roll;
	

	void show ()
	{
		super.show();
			System.out.println("Roll: "+roll);
	
	}
	Stu(String s,int a,int r)
	{
		super(s,a);
	roll=r;
	}

}
