package EmagHero;

public class DefenseClass implements Defense{
	int defense;
	
	public DefenseClass(int defense) {
		this.defense = defense;
	}

	@Override
	public int computeDamage(int attack) {
		return this.defense - attack;
	}
	
	
}
