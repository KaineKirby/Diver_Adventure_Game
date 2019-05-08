
public abstract class  Monster {
	int healthPoints;
	Hoard goldProtectedHoard; //Creating the data members for the class
	String fightWeapon;

	Monster (){ //This default constructor sets the default monster health at 0 and the default fight weapon to an empty string
		setHealthPoints(0);
		setFightWeapon("");
	}
	
	Monster (int hP, Hoard gold, String Weapon) { //This constructor takes the health points, gold object, and weapon and sets it to the given value
		setHealthPoints(hP);
		setGoldProtectedHoard(gold);
		setFightWeapon(Weapon);
		
		setGoldProtectedHoard(new Hoard());
		int randomGold = getGoldProtectedHoard().generateGold();
		getGoldProtectedHoard().setGold(randomGold);
	}
	
	public int getHealthPoints() { //Creating the accessor for health points data member
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) { //Creating the mutator for the health points data member
		this.healthPoints = healthPoints;
	}
	public Hoard getGoldProtectedHoard() { //Creating the accessor for gold hoard data member
		return goldProtectedHoard;
	}
	public void setGoldProtectedHoard(Hoard goldProtectedHoard) { //Creating the mutator for the gold hoard data member
		this.goldProtectedHoard = goldProtectedHoard;
	}
	public String getFightWeapon() { //Creating the accessor for fight weapon data member
		return fightWeapon;
	}
	public void setFightWeapon(String fightWeapon) { //Creating the mutator for the fight weapon data member
		this.fightWeapon = fightWeapon;
	}
	
	public abstract int attack(int playerDamageReceived); //Creating an abstract method that will define the attack details for each monster
	
	
	public String toString() { //Displaying the relevant information
		return "Monster Health Points: " + healthPoints 
				+"\n Protected Gold: " 
				+ goldProtectedHoard.getGold() + 
				"\n Fight Weapon: "
				+ fightWeapon;
	}
}
	