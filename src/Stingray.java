import java.util.Random;

public class Stingray extends Monster { //This class is an extension of the monster parent class
	static int defeated;
	
	
	Stingray() { //Creating the default constructor for this specific monster
		super (20 , new Hoard(), "Sting"); //Setting this monsters relevant information
		setDefeated (getDefeated());
	}
	
	public static int getDefeated() { //Accessor gets how many times the monster was defeated
		return defeated;
	}

	public static void setDefeated(int def) { //Mutator sets how many times the monster was defeated
		defeated = def;
	}
	
	public int attack(int playerDamageReceived) { //This attack method gives the details about (returns) how it will attack the scuba diver and recieves how the diver attacks it
		int stingrayCurrentHealth = getHealthPoints() - playerDamageReceived;
		setHealthPoints(stingrayCurrentHealth);
		Random rand = new Random();
		int attackValue = rand.nextInt(10-1+1) + 1; //This random number determines how much damage the monster will do
		
		return attackValue;
	}

	
	public String toString() { //Displaying the ASCII representation of the stingray
		return super.toString() + "  "
				   +"\n                (\\.-./)"
				   +"\n                /     \\"
				   +"\n              .'   :   '."
				   +"\n         _.-'`     '     `'-._"
				   +"\n      .-'          :          '-."
				   +"\n    ,'_.._         .         _.._',"
				   +"\n    '`    `'-.     '     .-' `    '"
				   +"\n              '.   :   .'"
				   +"\n                \\_. ._/"
				   +"\n          \\       |^|"
				   +"\n           |      | ;"
				   +"\n           \'.___.' /"
				   +"\n            '-....-' ";
	}
	
	
}
