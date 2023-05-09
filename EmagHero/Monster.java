package EmagHero;

public class Monster implements Creature{

	Health health;
	Defense defense;
	Luck luck;
	Speed speed;
	private int strength;
	Creature monster;
	
	public Monster(Health health, Defense defense, Luck luck,
			Speed speed, int strength, Creature monster) {
		this.health = new HealthClass(Utils.randomizeStats(60, 90));
		this.defense = new DefenseClass(Utils.randomizeStats(40, 60));
		this.luck = new LuckClass(Utils.randomizeStats(25, 40));
		this.speed = new SpeedClass(Utils.randomizeStats(40, 60));
		this.strength = Utils.randomizeStats(60, 90);
		this.monster = monster;
	}

	@Override
	public boolean isAttackingFirst(Speed speed, Luck luck) {
		if(speed.isFaster(speed)) {
			return true;
		}
		else if(speed.isSame(speed)) {
			if(luck.isLuckier(luck)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void attack(Creature creature) {
		monster.attack(creature);
	}

	@Override
	public boolean isAlive() {
		return health.isGreaterThan0();
	}

	@Override
	public void defend(int strength) {
		if(luck.isLucky())
		{
			return;
		}
		int damage = this.defense.computeDamage(strength);
		health.takeDamage(damage);
	}

}
