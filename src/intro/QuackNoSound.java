package intro;

public class QuackNoSound implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<Silent>>");
	}

}
