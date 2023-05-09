package EmagHero;

public class HealthClass implements Health {
	int health;
	
	public HealthClass(int health)
	{
		this.health = health;
	}
	@Override
	public boolean isGreaterThan0() {
		
		return health > 0;
	}

	@Override
	public void takeDamage(int damage) {
		health -= damage;
	}

}
