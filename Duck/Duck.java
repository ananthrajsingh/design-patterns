public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public Duck() {}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public abstract void display();

	public void swim() {
		System.out.println("All ducks are floating ducks, I am floating...");
	}
}
