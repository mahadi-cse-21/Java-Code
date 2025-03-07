package package162;
// 7 - 5 - 2024
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj1=new Scanner(System.in);
//		System.out.println("how many number do you take ?");
		
//		int n = obj1.nextInt();
//		if(n%2 == 0)
//		{
//			System.out.println("It is an even number.");
//		}
//		else {
//			System.out.println("It is an odd number.");
//		}
//		int n = obj1.nextInt();
//		int sum = 0;
//		for(int i = 0;i < n ; i++)
//		{
//			int b = obj1.nextInt();
//			
//		sum=sum+b;
//		}
//		System.out.println("The result is : "+sum);
//  	char ch ='e';
//		if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//		{
//			System.out.println("This is a vowel.");
//		}
//		else
//		{
//			System.out.println("This is consonant.");
//		}
		
		System.out.println("Enter a alphabet : ");
		char ch = obj1.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println(ch+" is a vowel.");
		break;
		default:
			System.out.println(ch+" is a consonant.");
		
		}

	}

}
