package EmagHero;

public class LuckClass implements Luck {
	int luck;
	@Override
	public boolean isLuckier(Luck luckClass) {
		return luckClass.isLuckier(luck);
	}
	
	public LuckClass(int luck) {
		this.luck = luck;
	}

	@Override
	public boolean isLucky() {
		int random = Utils.randomizeStats(0, 100);
		
		if(luck < random)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public boolean isLuckier(int luckValue) {
		return luck > luckValue;
	}

}
