import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) 
	{
		// Your code goes below here

		Dog test = new Dog("Buddy");
		test.setAge(5);
		System.out.println("This dog's name is " + test.getName() + " and he is " + test.getAge() + ".");
		Dog test2= new Dog("Beethoven", "Saint Bernard");
		System.out.println("This dog's name is " + test2.getName() + " and he is " + test2.getBreed() + ".");
		
		boolean dog= test.isSleeping();
	
			if(dog == true)
				{
					System.out.println(test.getName() + " is asleep.");
				}
			else if(dog == false)
				{
					test.bark();
				}
				
				
			if((test2.isSleeping() == false) && (dog == false))
				{
					test2.bark();
				}
			else if((test2.isSleeping() == true) && (dog == false))
				{
					test2.bark();
				}
	}
}
