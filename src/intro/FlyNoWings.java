package intro;

public class FlyNoWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Cannot fly, maybe try throwing.");
	}

}
