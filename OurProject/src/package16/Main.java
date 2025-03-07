package package16;

import java.rmi.AccessException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* Exception handling
        * 
        */
		try{
			String[] a = new String[10];
			a[20]="fflll";
//			int x=100;
//		
//		int y=0;
//		int res=x/y;
//		System.out.println("the result is : "+res);
//		System.out.println("helllo world");
		}
//		catch(Exception ee)
//		{
//			System.out.println("The Exception "+ee);
//		}
//		catch(ArrayIndexOutOfBoundsException  pp)
//		{
//			System.out.println("The Exception : "+pp);
//		}
//		catch(ArithmeticException e){
//			System.out.println("The Exception "+e);
//			
//		}
//		catch(Exception ee)
//		{
//			System.out.println("The Exception "+ee);
//		}
		catch(StringIndexOutOfBoundsException nn)
		{
			System.out.println("print"+nn);
		}
		finally {
			System.out.println("The finnally block");
		}
	}

}
