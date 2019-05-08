import java.util.Random;
public class ScubaDiver {
	private String name;
	private int healthPoints; //Here I am creating the data members for the class
	private int magicPoint;
	private Hoard goldCollected;
	
	public ScubaDiver() { //Creating the default constructor method for the diver here and initializing health points to 100 and magic points to 3
		setName("");
		setHealthPoints(100);
		setMagicPoint(3);
		setGoldCollected(new Hoard());
	}

	public String getName() { //Creating the accessor for the name data member
		return name;
	}

	public void setName(String name) { //Creating the mutator for the name data member
		this.name = name;
	}

	public int getHealthPoints() { //Creating the accessor for the health data member
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) { //Creating the mutator for the health data member
		this.healthPoints = healthPoints;
	}

	public int getMagicPoint() { //Creating the accessor for the magic data member
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) { //Creating the mutator for the magic data member
		this.magicPoint = magicPoint;
	}

	public Hoard getGoldCollected() { //Creating the accessor for the gold data member
		return goldCollected;
	}

	public void setGoldCollected(Hoard goldCollected) { //Creating the mutator for the gold object data member
		this.goldCollected = goldCollected;
	}
	
	public void addMoreGold(int goldCollected) { //This method uses info from the hoard method, creates a new object and sets it.
		Hoard presentHoard = getGoldCollected() ; 
		int presentGold = presentHoard.getGold();
		presentGold += goldCollected;
		presentHoard.setGold(presentGold);

	}
	
	public int attack(int monsterDamageReceived) { //Creating the details for the attack option. Receives a monster damage and returns an amount of damage to the monster
		int currentPlayerHealth = getHealthPoints() - monsterDamageReceived;
		setHealthPoints(currentPlayerHealth);
		Random rand = new Random();
		int attackDamage = rand.nextInt(15-1+1) + 1;
		
		return attackDamage;
	}
	
	public int beserk(int monsterDamageReceived) { //Creating the details for the beserk option. Receives a monster damage and returns an amount of damage to the monster
		int trueMonsterDamage = monsterDamageReceived * 2;
		int currentPlayerHealth = getHealthPoints() - trueMonsterDamage;
		setHealthPoints(currentPlayerHealth);
		Random rand = new Random();
		int beserkDamage = (rand.nextInt(15-1+1) + 1) * 3;
		
		return beserkDamage;
	}

	public String toString() { //Displaying the info for the diver
		return "Diver Name: " + getName() 
				+ "\n Health Points: " + getHealthPoints()
				+ "\n Magic Points: " + magicPoint
				+ "\n Gold Collected: " + goldCollected.getGold() 
				+" "
				   +"\n                             _______ ______"
				   +"\n                               |     / |    /"
				   +"\n                    O          |    /  |   /"
				   +"\n                               |   /   |  /"
				   +"\n                 o  O 0         \\  \\   \\  \\"
				   +"\n                 o               \\  \\   \\  \\"
				   +"\n                    o            /  /   /  /"
				   +"\n                     o     /\\_  /\\\\\\   /  /"
				   +"\n                      O  /    /    /     /"
				   +"\n              ..       /    /    /\\=    /"
				   +"\n             .  ))))))) = /====/    \\"
				   +"\n             . (((((((( /    /\\=  _ }"
				   +"\n             . |-----_|_+( /   \\}"
				   +"\n             . \\_<\\_//|  \\  \\ }"
				   +"\n              ...=Q=  |==)\\  \\"
				   +"\n                \\----/     ) )"   
				   +"\n                          / /"
				   +"\n                         /=/"
				   +"\n                       \\|/"
				   +"\n                       o} ";
	}
	
	
}
