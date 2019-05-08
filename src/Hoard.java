import java.util.Random;

public class Hoard { //This class will contain information that determines how the diver will get gold and how the monsters will get gold
	private int gold;
	
	Hoard () { //Setting the initial gold amount to 0, then generating it with the method below
		setGold(0);
	}
	
	public int getGold() { //Getting the amount of gold
		return gold;
	}

	public void setGold(int gold) { //Setting the amount of gold
		this.gold = gold;
	}
	
	public int generateGold() {
		Random rand = new Random();
		int monsterGold; 
		monsterGold = rand.nextInt(100-1+1) + 1; //Generating a random amount of gold in the range of 1 to 100.
		
		return monsterGold;
	}
}
