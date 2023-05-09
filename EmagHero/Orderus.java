package EmagHero;

import java.util.Random;

public class Orderus implements Creature{
	Health health;
	Defense defense;
	Luck luck;
	Speed speed;
	public int strength;
	Creature hero;
	
	public Orderus(Health health, Defense defense, Luck luck,
			Speed speed, int strength, Creature hero) {
		
		this.health = new HealthClass(Utils.randomizeStats(70, 100));
		this.defense = new DefenseClass(Utils.randomizeStats(45, 55));
		this.luck = new LuckClass(Utils.randomizeStats(10, 30));
		this.speed = new SpeedClass(Utils.randomizeStats(40, 50));
		this.strength = Utils.randomizeStats(70, 80);
		this.hero = hero;
	}

	
	public boolean rapidStrikeChance() {
		Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance <= 10;
	}
	
	public boolean magicShieldChance() {
		Random random = new Random();
		int chance = random.nextInt(100) + 1;
		return chance <= 20;
	}
	
	@Override
	public boolean isAttackingFirst(Speed speed, Luck luck) {
		return hero.isAttackingFirst(speed, luck);
	}

	@Override
	public void attack(Creature creature) {
		hero.attack(creature);
		
		if(rapidStrikeChance()) {
			hero.attack(creature);
		}
	}

	@Override
	public void defend(int strength) {
		hero.defend(strength);
	}

	@Override
	public boolean isAlive() {	
		return health.isGreaterThan0();
	}

}
