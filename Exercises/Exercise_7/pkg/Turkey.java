package pkg;
import java.util.Scanner;
import java.util.Random;


public class Turkey
	{
		public static String name;
		public String[] rat= new String[19];
		public int i;
		
		public Turkey() 
			{
				name= "Joe";
				// this is the default value and wiil print out as this
				// you should set default values beacuse the constructor will always run no matter what
			}
			
		public void printArt()
			{
				rat[0]= "						^^		^^";
				rat[1]= "				\\\\					/ / ";
				rat[2]=	"			\\\\								/ / ";
				rat[3]= "					^^			^^";
				rat[4]="		\\\\				 		 ||				/ / ";
				rat[5]="							 \\\\	  / / ";
				rat[6]="	\\\\		^^			 \\\\			 / /		^^	/ / ";
				rat[7]="			<		\\\\		  3			/ /			>";
				rat[8]="	\\\\	<		 \\\\			<  @ )			/ /				/ / ";
				rat[9]="					`~	~	 / /	~	~'		>>";
				rat[10]="	<<				`~~	 ~	 ||		~	~'		>	";
				rat[11]="		\\\\	<	`~	`~		=  =	~'	~'			  / / ";
				rat[12]=" 	     					`~ {= = = = = = = =} ~'";
				rat[13]="			\\\\			{===== ===== =====}		/ / ";	
				rat[14]="					    \\\\ {= = = = = == = = = =} / / ";
				rat[15]="						  {= = == = == === =}";
				rat[16]="				 		    = = === == = ";
				rat[17]="							||  ||";
				rat[18]="							/|\\ /|\\ ";
				
				for(i= 0; i < rat.length; i++)
				{
				System.out.println(rat[i]);
				}
			}
	}
