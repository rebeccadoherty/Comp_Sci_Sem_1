import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toStringArray(int[] a)
	{
		int count= 0;
		while(count < a.length)
		{
			System.out.println(a[count]);
			count++;
		}
		return;
	}
		
	public static int getArrayAverage(int[] b)
	{
		int count= 0;
		int k= 0;
		while((count + 1) < b.length)
		{
			k = k + b[count + 1];
			count++;
		}
		int average= k/b.length;
		return average;
	}
	
	public static int getArrayMax(int[] c)
	{
		int max= 1;
		int count= 0;
	
		while(count < c.length)
		{
			if(c[count] > max)
				{
					max= c[count]; 
				}
			count++;
		}
		return max;
	}
	
	public static int getArrayMin(int[] d)
	{
		int min= 100;
		int count= 0;
		
		while(count < d.length)
		{
			if(d[count] < min)
				{
					min= d[count]; 
				}
			count++;
		}
		
		return min;
	}
		
		
	public static void main(String args[]) {
		// Your code goes below here
		Random rand= new Random();
		int rand_array= rand.nextInt(199) + 51;
		int[] rat= new int[rand_array];
		int count= 0;
		
		while(count < rat.length)
		{
			int rand_num= rand.nextInt(99) + 1;
			rat[count]= rand_num;
			count++;
		}
		
		System.out.println("The number of elements is: " + rand_array);
		
		toStringArray(rat);
		System.out.println("This is the minimum: " + getArrayMin(rat));
		System.out.println("This is the maximum: " + getArrayMax(rat));
		System.out.println("This is the average: " + getArrayAverage(rat));
	}
}
