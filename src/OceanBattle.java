/* Austin Kirby
 * CS 180 - 02
 * 4-20-2017
 * 
 * In this program, I am creating a turn based game that takes place in the depths of the ocean. You play as a diver and
 * you must fight an army of monsters and defeat the evil Octopus to rescue the princess mermaid princess. This project
 * utilizes the java strategies of inheritance, composition, and polymorphism. The OceanBattle class is the test class
 * in which all objects are instantiated and all conditions are defined. There is a ScubaDiver class that defines the
 * information about the main character that the user plays as throughout the game, and a monster class that defines
 * the details about the extension classes Octopus, Lobster, Shark, and Stingray. Lastly, there is a Hoard class that
 * defines the details about the gold object that is used to keep track of how much gold that the diver and the monsters
 * receive each turn.
 */

import java.util.Random;
import java.util.Scanner;

public class OceanBattle { 

	private ScubaDiver fighter;
	private Monster oceanMonsters []; //Here I am declaring the data members for this class
	
	public OceanBattle() { //Creating the default constructor here, in which I am creating a fighter object and calling the fill monster array with a random monster
		ScubaDiver fighter;
		setOceanMonsters();
	}
	
	public ScubaDiver getFighter() { //Creating an accessor for the fighter object
		return fighter;
	}
	public void setFighter(ScubaDiver fighter) { //Creating a mutator for the fighter object
		this.fighter = new ScubaDiver();
	}
	public Monster[] getOceanMonsters() { //Creating an accessor for the monster array
		return oceanMonsters;
	}
	public void setOceanMonsters() { //Creating a mutator that fills the monster array with the four monsters in a random order
		this.oceanMonsters = new Monster [4];
		Random rand = new Random();
		int randomIndex;
		
		
		randomIndex = rand.nextInt(3-0+1) + 0;
		oceanMonsters[randomIndex] = new Octopus();
		
		randomIndex = rand.nextInt(3-0+1) + 0;
		while(oceanMonsters[randomIndex] != null) {
			randomIndex = rand.nextInt(3-0+1) + 0;
		} 
		oceanMonsters[randomIndex] = new Shark();		//In each block in this section I am filling one index of the array with a monster
		
		
		randomIndex = rand.nextInt(3-0+1) + 0;
		while(oceanMonsters[randomIndex] != null) {
			randomIndex = rand.nextInt(3-0+1) + 0;
		}
		oceanMonsters[randomIndex] = new Stingray();
		
		
		randomIndex = rand.nextInt(3-0+1) + 0;
		while(oceanMonsters[randomIndex] != null) {
			randomIndex = rand.nextInt(3-0+1) + 0;
		} 
		oceanMonsters[randomIndex] = new Lobster();
		
	}
	
	public void Fight () { //This method initiates the encounter between the scuba diver and one of the monsters
		System.out.println("Welcome to the start of your adventure! "
				+ "\nThe evil octopus has kidnapped the fair mermaid princess of JavaLabnia! "
				+ "\nWith only three spare oxygen tanks, can you make it past the army of monster standing between you and her? ");
		System.out.println("We all believe in you!");
		System.out.println();
		System.out.println("Enter your diver's name:");
		
		ScubaDiver player = new ScubaDiver();
		Scanner input = new Scanner(System.in);
		String playerName = input.next();		//Here I am prompting the user for the name of their diver
		setFighter(player);
		fighter.setName(playerName);
		
		boolean gameFinished = false;
		Random rand = new Random();		//Here and below I am creating a new random integer to choose each monster in a random order
		int randomEncounterNumber;
		
		while (gameFinished == false) {
			randomEncounterNumber = rand.nextInt(11-0+1) + 0;
			
			int monsterLocation = 0;
			if(randomEncounterNumber == 0 || randomEncounterNumber == 1 || randomEncounterNumber == 2) { //Setting the random range and details for the Lobster encounter
				for(int i = 0; i < getOceanMonsters().length; i++) {
					if(getOceanMonsters()[i] instanceof Lobster){
						monsterLocation = i;
						
					}
				}
					System.out.println("You've encountered a Lobster! ");
					System.out.println("");
					System.out.println(fighter.toString());
					System.out.println(((Lobster)getOceanMonsters()[monsterLocation]).toString());
					System.out.println("What will you do? "
							+ "\n[A]ttack "
							+ "\n[B]erserk attack (3x damage, 2x return damage) "
							+ "\n[M]agic (heal to full, but the monster gets a free attack!) "
							+ "\n[R]unaway (get away from the monster, but it gets a free attack!) "); //Giving the user options for their encounter
					
			}
			
			else if (randomEncounterNumber == 3 || randomEncounterNumber == 4 || randomEncounterNumber == 5) { //Setting the random range and details for the Stingray encounter
				
				for(int i = 0; i < getOceanMonsters().length; i++) {
					if(getOceanMonsters()[i] instanceof Stingray){
						monsterLocation = i;
							
						}
					}
					System.out.println("You've encountered a Stingray! ");
					System.out.println("");
					System.out.println(fighter.toString());
					System.out.println(((Stingray)getOceanMonsters()[monsterLocation]).toString());
					System.out.println("What will you do? "
							+ "\n[A]ttack "
							+ "\n[B]erserk attack (3x damage, 2x return damage) "
							+ "\n[M]agic (heal to full, but the monster gets a free attack!) "
							+ "\n[R]unaway (get away from the monster, but it gets a free attack!) "); //Giving the user options for their encounter
			}
			
			else if(randomEncounterNumber == 6 || randomEncounterNumber == 7 || randomEncounterNumber == 8) { //Setting the random range and details for the Shark encounter
				for(int i = 0; i < getOceanMonsters().length; i++) {
					if(getOceanMonsters()[i] instanceof Shark){
						monsterLocation = i;
						
					}
				}
					System.out.println("You've encountered a Shark! ");
					System.out.println("");
					System.out.println(fighter.toString());
					System.out.println(((Shark)getOceanMonsters()[monsterLocation]).toString());
					System.out.println("What will you do? "
							+ "\n[A]ttack "
							+ "\n[B]erserk attack (3x damage, 2x return damage) "
							+ "\n[M]agic (heal to full, but the monster gets a free attack!) "
							+ "\n[R]unaway (get away from the monster, but it gets a free attack!) "); //Giving the user options for their encounter
			}
			
			else if(randomEncounterNumber == 9 || randomEncounterNumber == 10) { //Setting the random range and details for the Octopus encounter
				for(int i = 0; i < getOceanMonsters().length; i++) {
					if(getOceanMonsters()[i] instanceof Octopus){
						monsterLocation = i;
						
					}
				}
					System.out.println("You've encountered an Octopus! ");
					System.out.println("");
					System.out.println(fighter.toString());
					System.out.println(((Octopus)getOceanMonsters()[monsterLocation]).toString());
					System.out.println();
					System.out.println("What will you do? "
							+ "\n[A]ttack "
							+ "\n[B]erserk attack (3x damage, 2x return damage) "
							+ "\n[M]agic (heal to full, but the monster gets a free attack!) "
							+ "\n[R]unaway (get away from the monster, but it gets a free attack!) "); //Giving the user options for their encounter
			}
			
			else if(randomEncounterNumber == 11) { //If the random number generated is 11, then you get a free magic point 
				fighter.setMagicPoint(fighter.getMagicPoint() + 1);
				System.out.println("You have discovered a tank of oxygen under a sunken ship! (+1 Magic Point) ");
				System.out.println("");
			}
			
			if(randomEncounterNumber != 11) { //If the random number generates an encounter then the entered choice is verified
				String userChoice = input.next();
				while (!userChoice.equalsIgnoreCase("A") && !userChoice.equalsIgnoreCase("B") && !userChoice.equalsIgnoreCase("R") && !userChoice.equalsIgnoreCase("M")) {
					System.out.println("Invalid choice, try again! ");
					userChoice = input.next();
				}
				
				if(userChoice.equalsIgnoreCase("A")) {
					attack(getOceanMonsters()[monsterLocation]);
				}
				
				else if(userChoice.equalsIgnoreCase("B")) {
					beserk(getOceanMonsters()[monsterLocation]);
				}
				
				else if(userChoice.equalsIgnoreCase("R")){
					runaway(getOceanMonsters()[monsterLocation]);
				}
				
				else if(userChoice.equalsIgnoreCase("M")) {
					if(fighter.getMagicPoint() > 0) {
						magic(getOceanMonsters()[monsterLocation]);
					}else {
						noMagic(getOceanMonsters()[monsterLocation]);
					}
				}
				
			
				if(fighter.getHealthPoints() <= 0) { //If the fighter's health falls below 0, the game is over
					if(fighter.getMagicPoint() > 0) { //If the fighter's magic points are 1 or more the scuba diver's health is filled to 100
						fighter.setHealthPoints(fighter.getHealthPoints() + 100);
						fighter.setMagicPoint(fighter.getMagicPoint()-1);
						
					} else {
						gameFinished = true;
						System.out.println("You Died! Game Over!"); //If the fighter's health falls below 0, the game is over
					}
				}
				 	if(getOceanMonsters()[monsterLocation].getHealthPoints() <= 0) { //If the monster's health reaches 0 or lower, then a defeat message is printed
						System.out.println("Monster has been defeated! ");
						System.out.println();
						
						Hoard goldWon = getOceanMonsters()[monsterLocation].getGoldProtectedHoard();
						fighter.addMoreGold(goldWon.getGold());
					
					if(getOceanMonsters()[monsterLocation] instanceof Octopus) { //If the octopus is defeated the game ends and a victory message is printed
						gameFinished = true;
						System.out.println("Congratulations! You have slain the evil Octopus and saved the Mermaid Princess of JavaLabnia!");
						System.out.println("");
						System.out.println(""
+"\n  	  		     .----. "
+"\n                            (___/  \\ "
+"\n         ,                 (|^ ^ ) ) "
+"\n        /(                _)\\=_/  ( "
+"\n ,..__/ `\\          ____(_/_ ` \\   ) "
+"\n  `\\    _/        _/---._/(_)_  `\\ ( "
+"\n    '--\\ `-.__..-'    /.    (_), |  ) "
+"\n        `._        ___\\_____.'_| |__/ "
+"\n           `~----`   `-.........'     ");

						System.out.println();
						statistics();
					}
					else if(getOceanMonsters()[monsterLocation] instanceof Shark) { //If the Shark is defeated, a new Shark is generated and the defeated variable is incremented
						Shark.setDefeated(Shark.getDefeated()+1);
						getOceanMonsters()[monsterLocation] = new Shark();
					}
					else if(getOceanMonsters()[monsterLocation] instanceof Lobster) { //If the Lobster is defeated, a new Lobster is generated and the defeated variable is incremented
						Lobster.setDefeated(Lobster.getDefeated()+1);
						getOceanMonsters()[monsterLocation] = new Lobster();
					}
					else if(getOceanMonsters()[monsterLocation] instanceof Stingray) { //If the Stingray is defeated, a new Stingray is generated and the defeated variable is incremented
						Stingray.setDefeated(Stingray.getDefeated()+1);
						getOceanMonsters()[monsterLocation] = new Stingray();
					}
				}
			}	
		}
		
	}
	
	public void attack(Monster monster) { //In this method I am calling the attack method from both the monster and scuba diver class
		int playerAttack = getFighter().attack(0);
		int monsterAttack = monster.attack(playerAttack);
		getFighter().attack(monsterAttack);
		
		System.out.println("You hit the monster for " + playerAttack + " damage! It counters with its attack for " + monsterAttack + " damage!");
		System.out.println("");
	}
	
	public void beserk(Monster monster) { //In this method I am calling the beserk method from both the monster and scuba diver class
		int playerAttack = getFighter().beserk(0);
		int monsterAttack = monster.attack(playerAttack);
		getFighter().beserk(monsterAttack);
		
		System.out.println("You fly into a wild rage! You manage to hit the monster for " + playerAttack + " points of damage! But you're left open, and the monster strikes with its attack for " + (monsterAttack * 2) + " damage!");
		System.out.println("");
	}
	
	public void runaway(Monster monster) { //Here I am creating a method for the runaway option, where the diver flees but takes damage
		int monsterAttack = monster.attack(0);
		getFighter().attack(monsterAttack);
		
		System.out.println("You flee from the monster! However, the monster is able to strike you with its attack. You take " + monsterAttack + " damage!");
	}
	
	public void magic(Monster monster) { //Here I am creating a method for the use of a magic point, the diver's health is restored but they still take damage
		int monsterAttack = monster.attack(0);
		fighter.setHealthPoints(100-monsterAttack);
		
		fighter.setMagicPoint(fighter.getMagicPoint()-1);
		
		System.out.println("You use one of your spare oxygen tanks to return to full health! However, the monster is able to get in a strike with its attack while you change tanks! You take "+ monsterAttack +" damage!");
		System.out.println("");
	}
	
	public void noMagic(Monster monster) { //If the diver has no oxygen tanks left then they will only take damage.
		int monsterAttack = monster.attack(0);
		fighter.setHealthPoints(fighter.getHealthPoints()-monsterAttack);
		System.out.println("You are out of Oxygen Tanks! The monster is able to get in a strike with its attack while you change tanks! You take "+ monsterAttack +" damage!");
		System.out.println("");
	}
	
	public void statistics() { //Here I am displaying the monster defeated counters
		System.out.println("Game Statistics:");
		System.out.println();
		System.out.println("You collected " + fighter.getGoldCollected().getGold() + " gold.");
		System.out.println("You defeated " + Lobster.getDefeated() + " Lobsters! ");
		System.out.println("You defeated " + Stingray.getDefeated() + " Stingray! ");
		System.out.println("You defeated " + Shark.getDefeated() + " Shark! ");
		System.out.println("You defeated the Octopus Boss! ");
	}
	
	public static void main (String [] arg) {
		OceanBattle Battle = new OceanBattle(); //In the main method I am calling the fight method and creating a new battle.
		Battle.Fight();
	}
}