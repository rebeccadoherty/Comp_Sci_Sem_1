package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog 
{
	public String name;
	public int age;
	public String breed;

	public Dog() 
	{
		name= "Clifford";
		age= 3;
		breed= "big red dog";
	}
	
	public Dog(String a)
	{
		name= a;
		age= 1;
		breed= "dog dog";
	}
	
	public Dog(String b, String c)
	{
		name= b;
		age= 1;
		breed= c;
	}
	
	public Dog(String d, int e)
	{
		name= d;
		age= e;
		breed= "dog dog";
	}
	
	public void setName(String x)
	{
		name= x;
		return;
	}
	
	public void setAge(int y)
	{
		age= y;
		return;
	}
	
	public void setBreed(String z)
	{
		breed= z;
		return;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getBreed()
	{
		return breed;
	}
	//if you had put static for your get...() and set...() then you would have set every Dog to that age, name or breed after you had called it in the main method
	
	public static boolean isSleeping()
	{
		Random rand= new Random();
		int random_num= rand.nextInt(2);
		
		if(random_num == 1)
			{
			return false;
			}
			return true;
	}
	
	public void bark()
	{
		System.out.println("This dog's name is " + name + " and it barks.");
		return;
	}
}

