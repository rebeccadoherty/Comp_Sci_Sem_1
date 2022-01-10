package pkg;
import java.util.Scanner;
import java.util.Random;


public class Cat
	{
		
		public static String name;
		
		public Cat() 
			{
				name= "Garfield";
				// this is the default value and wiil print out as this
				// you should set default values beacuse the constructor will always run no matter what
			}
			
		public Cat(String a)
			{
				name= a;
				// this is giving this string a name
			}
			
			public static void meow()
				{
					System.out.println(name + " meows.");
				}
		
	}
