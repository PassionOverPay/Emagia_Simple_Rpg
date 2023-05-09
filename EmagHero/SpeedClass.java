package EmagHero;

public class SpeedClass implements Speed {
	int speedValue;
	
	public SpeedClass(int speedValue) {
		super();
		this.speedValue = speedValue;
	}

	@Override
	public boolean isSame(Speed speed) {
		
		return speed.isSame(speedValue);
	}

	@Override
	public boolean isFaster(Speed speed) {
	
		return speed.isFaster(speedValue);
	}

	@Override
	public boolean isSame(int speedValue1) {
		return speedValue1 == speedValue;

	}

	@Override
	public boolean isFaster(int speedValue1) {
		// TODO Auto-generated method stub
		return speedValue1 > speedValue;
	}

}
