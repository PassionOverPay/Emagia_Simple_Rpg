package EmagHero;

public interface PlayerBuilder {
	void randomHealth(int min, int max);
	void randomStrength(int min, int max);
	void randomDefense(int min, int max);
	void randomSpeed(int min, int max);
	void randomLuck(int min, int max);
	int getRandomValueInRange(int min, int max);
}
