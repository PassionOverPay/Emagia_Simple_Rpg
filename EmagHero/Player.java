package EmagHero;

public interface Player {
	
	void defend(int strength);
	void attack(Player player);
	Boolean attackFirst(int speed, int luck);
	Boolean isAlive();
}
