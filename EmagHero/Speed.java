package EmagHero;

public interface Speed {
	boolean isSame(int speedValue);
	boolean isFaster(int speedValue);
	
	
	boolean isSame(Speed speed);
	boolean isFaster(Speed speed);
}
