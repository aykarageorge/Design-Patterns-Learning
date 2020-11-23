package intro;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super("Rubber Duck");
		flyBehavior = new FlyNoWings();
		quackBehavior = new QuackSqueak();
	}

}
