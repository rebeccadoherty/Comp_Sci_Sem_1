import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	System.out.println("");
	Ascii test4= new Ascii("Other");
	test4.setName("lol");
	test4.setNumber(3);
	test4.setAscii("~~~~~~~~~~~~~~~~~~~~");
	test4.printArt();

	Ascii test = new Ascii("Cactus");
	test.setName("Sporky");
	test.setNumber(3);
	test.printArt();
	
	System.out.println("");
	Ascii test2= new Ascii("Human", "Bowlf", 2);
	test2.setType("Human");
	test2.setName("Bowlf");
	test2.setNumber(2);
	test2.printArt();
	
	System.out.println("");
	Ascii test3= new Ascii("Dog", "Rufus");
	test3.setNumber(2);
	test3.printArt();
	
	System.out.println("");
	Ascii test5= new Ascii("Bunny", 2);
	test5.setName("Hunny Bun");
	test5.printArt();
	}
}
