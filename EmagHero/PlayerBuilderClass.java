package EmagHero;

public class PlayerBuilderClass implements PlayerBuilder{

	@Override
	public void randomHealth(int min, int max) {
		int health = getRandomValueInRange(min,max);
	}

	@Override
	public void randomStrength(int min, int max) {
		int strength = getRandomValueInRange(min,max);
	}

	@Override
	public void randomDefense(int min, int max) {
		int defense = getRandomValueInRange(min,max);	
	}
	@Override
	public void randomSpeed(int min, int max) {
		int speed = getRandomValueInRange(min,max);
	}

	@Override
	public void randomLuck(int min, int max) {
		int luck = getRandomValueInRange(min,max);
	}

	@Override
	public int getRandomValueInRange(int min, int max) {
		// TODO Auto-generated method stub
		return 0;
	}


}
