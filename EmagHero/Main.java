package EmagHero;

public class Main {

	public static void main(String[] args) {

		HealthClass health = new HealthClass(Utils.randomizeStats(70, 100));
		DefenseClass defense = new DefenseClass(Utils.randomizeStats(45, 55));
		LuckClass luck = new LuckClass(Utils.randomizeStats(10, 30));
		SpeedClass speed = new SpeedClass(Utils.randomizeStats(40, 50));
		int strength = Utils.randomizeStats(70, 80);
		
		
		CreatureClass orderus = new CreatureClass();
		CreatureClass monster = new CreatureClass();
		
		
		Orderus orderusHero = new Orderus(health, defense, luck, speed, strength, orderus );	
		
		
		HealthClass monsterHealth = new HealthClass(Utils.randomizeStats(60, 90));
		DefenseClass monsterDefense = new DefenseClass(Utils.randomizeStats(40, 60));
		LuckClass monsterLuck = new LuckClass(Utils.randomizeStats(25, 40));
		SpeedClass monsterSpeed = new SpeedClass(Utils.randomizeStats(40, 60));
		int monsterStrength = Utils.randomizeStats(60, 90);
		
		Monster monsterMonster = new Monster(monsterHealth, monsterDefense,
				monsterLuck, monsterSpeed, monsterStrength, monster );
		GameManager gameManager = new GameManager(orderusHero, monsterMonster);
		
		
		gameManager.playGame();
	}

}
