package EmagHero;

public class GameManager {
	static Creature attacker;
	static Creature defender;
	int health;
	
	public GameManager(Creature attacker, Creature defender) {
		this.attacker = attacker;
		this.defender = defender;
	}

	public void endTurn() {
		Creature player = attacker;
		attacker = defender;
		defender = player;
	}
	
	private void turn(){
			attacker.attack(defender);
			endTurn();
			if(attacker.isAlive())
			{
				attacker.attack(defender);
			}
	}
	
	public void playGame()
	{
		turn();
	}
}
