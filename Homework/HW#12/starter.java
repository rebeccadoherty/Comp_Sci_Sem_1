import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	
	public static void shronk(String a)
	{
		int count= 0;
		while(count < 420)
		{
		System.out.println(a);
		count++;
		}
		return;
	}
	
	public static int getArrayAverage(int[] b)
	{
		int count= 0;
		int ick= 0;
		while((count + 1) < b.length)
		{
			ick = ick + b[count + 1];
			count++;
		}
		int average= ick/b.length;
		return average;
	}
	
	
	public static void main(String args[]) 
	{
		// Your code goes below here

		Scanner sc= new Scanner(System.in);
		
		int[] jared19= new int[5];
		for(int x= 0; x < jared19.length; x++)
		{
			System.out.print(jared19[x]= x + 1);
		}
		
		System.out.println("");
		
		int[] PATRICIA= {60, 61, 62, 63, 64, 65, 66, 67, 68, 69};
		for(int meh= 0; meh < PATRICIA.length; meh= meh + 3)
		{
			PATRICIA[meh]= meh;
			System.out.println(PATRICIA[meh]);
		}
		
		String a= "HURRICANE TORTILLA";
		String b= "hurricane tortilla";
		if(a.equals(b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		System.out.println("Sus");
		System.out.println("nO");
		System.out.println("Picious");
		
		
		Random rand= new Random();
		int count3= 0;
		int ninki_minjaj= rand.nextInt(69) + 1;
		int[] iridocyclitosis= new int[ninki_minjaj];
		while(count3 < iridocyclitosis.length)
		{
			int chicken_nuggets= rand.nextInt(9) + 1;
			iridocyclitosis[count3]= chicken_nuggets;
			System.out.println(iridocyclitosis[count3]);
			count3++;
		}
		
		int count2= 0;
		int rand_value2= rand.nextInt(9) + 1;
		int[] rat= new int[20];
		
		while((count2 < rat.length))
		{
			int rand_value= rand.nextInt(9) + 1;
			rat[count2]= rand_value;
			count2++;
		}
	
		System.out.println("The target number is " + rand_value2);
		
		for(count2= 0; count2 < rat.length; count2++)
		{
			if(rat[count2] == rand_value2)
			{
				for(int j= count2 + 1; j < rat.length; j++)
				{
					if(rat[count2] == rat[j])
					{
					System.out.println("These are the index values are "  + count2 + " and " + j + " and is " + rand_value2 + " duplicated.");
					}
				}
			}
		}
		
		
		System.out.println("Please input a phrase.");	
		String response= sc.nextLine();
		shronk(response);
		
		System.out.println("Please input your age.");
		int response2= sc.nextInt();
		Ratatouille remy= new Ratatouille(response2);
		System.out.println("Your age is: " + remy.age);
		
		Ratatouille emile= new Ratatouille();
		System.out.println(emile.eek);
		
		String bing_bong= "abcdefghijklmnopqrstuvwxyz ";
		System.out.println(bing_bong.substring(26));
		
		
		int rand_array= rand.nextInt(199) + 51;
		int[] bao= new int[rand_array];
		int count= 0;
		
		while(count < bao.length)
		{
			int rand_num= rand.nextInt(99) + 1;
			bao[count]= rand_num;
			count++;
		}
		System.out.println("This is the average: " + getArrayAverage(bao));
		
	
		String _a= "My Little Pony";
		String _b= "My Little Pony";
		String _c= "Ahh, ahh, ahh, ahhh...";
		String _d= "My Little Pony";
		String _e= "I used to wonder what friendship could be";
		String _f= "My Little Pony";
		String _g= "Until you all shared its magic with me";
		String _h= "Big adventure";
		String _i= "Tons of fun";
		String _j= "A beautiful heart";
		String _k= "Faithful and strong";
		String _l= "Sharing kindness";
		String _m= "It's an easy feat";
		String _n= "And magic makes it all complete";
		String _o="You have my little ponies";
		String _p= "Do you know you're all my very best friends?";
		
		if((_a.equals(_b)) || (_f.equals(_a)))
		{
			System.out.println(_h + _i);
		}
		
		int count5= 0;
		while(count < 10)
		{
			System.out.println(count);
			count++;
		}
		
		String i_dont_want_to_do_this_anymore= "would anyone like some stew";
		System.out.println(i_dont_want_to_do_this_anymore.substring(27,28));
		
	}
}
