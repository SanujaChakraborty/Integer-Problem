import java.util.*;

public class IntegerProblem {
	static int smallestDivisor(int x)
	{
	    // if divisible by 2
	    if (x % 2 == 0)
	        return 2; 	 
	    else	 
	    	return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l, r ;
		int sum = 0;
		System.out.println("Value of n:");
		int n = sc.nextInt();
		System.out.println("Value of q:");
		int q = sc.nextInt();
		int[] arr = new int[n+1];
		System.out.println("Value of array elements:");
		for(int i = 1;i < n+1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Value of query elements:");
		for(int j = 0;j < q;j++)
		{
			l = sc.nextInt();
			r = sc.nextInt();
			for(int i = l;i<= r;i++)
			{
				sum = sum + smallestDivisor(arr[i]);
			}
			System.out .println(" "+sum);
			sum = 0;
		}
		
	}

}
