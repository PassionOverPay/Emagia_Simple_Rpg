package EmagHero;

public class MagicShieldAbility implements MagicShield {
	Luck luck;
	int defense;
	

	@Override
	public int newDefense(int attack) {
		if(luck.isLucky())
		{
		return defense - attack / 2;
		}
		else {
			return defense -  attack;
		}
	}
	
}
