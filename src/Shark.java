import java.util.Random;

public class Shark extends Monster{ //This class is an extension of the monster parent class
	static int defeated = 0;
	
	Shark () { //Creating the default constructor for this specific monster
		
		super (50 , new Hoard() , "Bite"); //Setting this monsters relevant information
		setDefeated (getDefeated());
	}
	
	public static int getDefeated() { //Accessor gets how many times the monster was defeated
		return defeated;
	}

	public static void setDefeated(int def) { //Mutator sets how many times the monster was defeated
		defeated = def;
	}
	
	public int attack(int playerDamageReceived) { //This attack method gives the details about (returns) how it will attack the scuba diver and recieves how the diver attacks it
		int sharkCurrentHealth = getHealthPoints() - playerDamageReceived;
		setHealthPoints(sharkCurrentHealth);
		Random rand = new Random();
		int attackValue = rand.nextInt(25-1+1) + 1; //This random number determines how much damage the monster will do
		
		return attackValue;
	}

	
	public String toString() { //Displaying the ASCII representation of the shark
		return super.toString() + " "
				   +"\n _________         .    . "
				   +"\n(..       \\_    ,  |\\  /| "
				   +"\n \\       O  \\  /|  \\ \\/ / "
				   +"\n  \\______    \\/ |   \\  /  "
				   +"\n     vvvv\\    \\ |   /  | "
				   +"\n     \\^^^^  ==   \\_/   | "
				   +"\n      `\\_   ===    \\.  | "
				   +"\n      / /\\_   \\ /      | "
				   +"\n      |/   \\_  \\|      / "
				   +"\n             \\________/  " ;
	}
	
}
