package intro;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	String duckType;

	public Duck(String duckType) {
		this.duckType = duckType;
		System.out.println("Creating " + duckType);
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void makeSound() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("Duck Swimming");
	}

}
