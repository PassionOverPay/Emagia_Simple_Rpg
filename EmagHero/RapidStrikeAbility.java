package EmagHero;

public class RapidStrikeAbility implements RapidStrike {
	Luck luck;
	@Override
	public boolean useSkill() {
		return luck.isLucky();
	}
}
