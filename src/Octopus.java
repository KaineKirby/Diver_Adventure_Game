import java.util.Random;

public class Octopus extends Monster { //This class is an extension of the monster parent class
	
	Octopus () { //Creating the default constructor for this specific monster
		super (100, new Hoard(), "Black Ink"); //Setting this monsters relevant information
	
	}
	
	public int attack(int playerDamageReceived) { //This attack method gives the details about (returns) how it will attack the scuba diver and recieves how the diver attacks it
		int octopusCurrentHealth = getHealthPoints() - playerDamageReceived;
		setHealthPoints(octopusCurrentHealth);
		Random rand = new Random();
		int attackValue = rand.nextInt(20-1+1) + 1; //This random number determines how much damage the monster will do
		
		return attackValue;
	}

	
	public String toString() { //Displaying the ASCII representation of the octopus
		return super.toString() + " "
				   +"\n                    .-'   `'. "
				   +"\n                   /         \\ "
				   +"\n                   |         ; "
				   +"\n                   |         |           ___.--, "
				   +"\n          _.._     |0) ~ (0) |    _.---'`__.-( (_. "
				   +"\n   __.--'`_.. '.__.\\    '--. \\_.-' ,.--'`      `\"\"` "
				   +"\n  ( ,.--'`   ',__ /./;   ;, '.__.'`    __ "
				   +"\n  _`) )  .---.__.' / |   |\\   \\__..--\"\"  \"\"\"--.,_ "
				   +"\n `---' .'.''-._.-'`_./  /\\ '.  \\ _.-~~~````~~~-._`-.__.' "
				   +"\n       | |  .' _.-' |  |  \\  \\  '.               `~---` "
				   +"\n        \\ \\/ .'     \\  \\   '. '-._) "
				   +"\n         \\/ /        \\  \\    `=.__`~-. "
				   +"\n         / /\\         `) )    / / `\"\".`\\ "
				   +"\n   , _.-'.'\\ \\        / /    ( (     / / "
				   +"\n    `--~`   ) )    .-'.'      '.'.  | ( "
				   +"\n           (/`    ( (`          ) )  '-; "
				   +"\n            `      '-;         (-'  ";
	}
	
}
