import java.util.*;
public class sample
{
	public static void  add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		add(N1,N2);
	}
}

