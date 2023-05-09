package EmagHero;

public interface Creature {
	public boolean isAttackingFirst(Speed speed, Luck luck);
	public void attack(Creature creature);
	public void defend(int damage);
	public boolean isAlive();
}
