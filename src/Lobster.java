import java.util.Random;

public class Lobster extends Monster { //This class is an extension of the monster parent class
	static int defeated;

	Lobster() { //Creating the default constructor for this specific monster
		super (10, new Hoard(), "Claw"); //Setting this monsters relevant information
		setDefeated (getDefeated());
	}
	
	public static int getDefeated() { //Accessor gets how many times the monster was defeated
		return defeated;
	}

	public static void setDefeated(int def) { //Mutator sets how many times the monster was defeated
		defeated = def;
	}
	
	public int attack(int playerDamageReceived) { //This attack method gives the details about (returns) how it will attack the scuba diver and recieves how the diver attacks it
		int lobsterCurrentHealth = getHealthPoints() - playerDamageReceived;
		setHealthPoints(lobsterCurrentHealth);
		Random rand = new Random();
		int attackValue = rand.nextInt(5-1+1) + 1; //This random number determines how much damage the monster will do
		
		return attackValue;
	}


	public String toString() { //Displaying the ASCII representation of the lobster
		return super.toString() + ""
				   +"\n           .\"\".-._.-.\"\". "
				   +"\n          |   \\  |  /   | "
				   +"\n           \\   \\.T./   /  "
				   +"\n            '-./   \\.-' "
				   +"\n              /     \\ "
				   +"\n             ;       ; "
				   +"\n             |       | "
				   +"\n             |       | "
				   +"\n            /         \\ "
				   +"\n            |    .    | "
				   +"\n         __.|    :    |.__ "
				   +"\n     .-'`   |    :    |   `'-. "
				   +"\n   /`     .\"\\  0 : 0  /\".     `\\ "
				   +"\n  |     _/   './ : \\.'   \\_     | "
				   +"\n  |    /      /`\"\"\"`\\      \\    | "
				   +"\n   \\   \\   .-'       '._   /   / "
				   +"\n    '-._\\                 /_.-'  " ;
	}

}
