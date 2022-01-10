package pkg;
import java.util.Scanner;
import java.util.Random;

//what does it mean by role check
public class myCharacter 
{
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	public int i;

	public myCharacter() 
	{
		role= "No role";
		strength= 0;
		dexterity= 0;
		intelligence= 0;
		charisma= 0;
		constitution= 0;
	}
	
	public int setStrength(int a)
	{
		strength= a;
		return strength;
	}
	
	public int setDexterity(int b)
	{
		dexterity= b;
		return dexterity;
	}
	
	public int setIntelligence(int c)
	{
		intelligence= c;
		return intelligence;
	}
	
	public int setConstitution(int d)
	{
		constitution= d;
		return constitution;
	}
	
	public int setCharisma(int e)
	{
		charisma= e;
		return charisma;
	}
	
	public String setRole(String m)
	{
		role= m;
		i= i + 1;
		
		while(true)
		{
			if(role.equals("Wizard") || role.equals("wizard") || role.equals("WIZARD"))
				{
					System.out.println("Your healing magic will save many lives.");
					System.out.println("Your strength is: 0");
					System.out.println("Your intelligence is: 0");
					System.out.println("Your charisma is: 0");
					System.out.println("Your constitution is: 0");
					System.out.println("Your dexterity is: 0");
					break;
				}
	
			else if(role.equals("Warrior") || role.equals("warrior") || role.equals("WARRIOR"))
				{
					System.out.println("Shinzou sasageyo!");
					System.out.println("Your strength is: 0");
					System.out.println("Your intelligence is: 0");
					System.out.println("Your charisma is: 0");
					System.out.println("Your constitution is: 0");
					System.out.println("Your dexterity is: 0");
					break;
				}
				
	
			else if(role.equals("Rogue") || role.equals("rogue") || role.equals("ROGUE"))
				{
					System.out.println("You have committed high treason against the King of Eldia! Prepare to die!");
					System.out.println("Your strength is: 0");
					System.out.println("Your intelligence is: 0");
					System.out.println("Your charisma is: 0");
					System.out.println("Your constitution is: 0");
					System.out.println("Your dexterity is: 0");
					break;
				}
	
			else
				{
					System.out.println("Please choose one of the aformentioned options. :)");
				}
				i++;
				
		}
		return role;
	}		
	
	public boolean setAll(String x, int y, int z, int w, int r, int t)
	{
		role= x;
		strength= y;
		dexterity= z;
		intelligence= w;
		constitution= r;
		charisma= t;
		return true;
	}

}

