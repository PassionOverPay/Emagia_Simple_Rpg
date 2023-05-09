package EmagHero;

public class CreatureClass implements Creature {
	private int health;
    private int strength;
    private int defense;
    private int speed;
    private int luck;
	@Override
	public boolean isAttackingFirst(Speed speed, Luck luck) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void attack(Creature creature) {
		// TODO Auto-generated method stub

	}

	@Override
	public void defend(int damage) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

}
