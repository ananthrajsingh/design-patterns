public class MallardDuck extends Duck {
	public MallardDuck() {
		// Pass the implementation classes
		// of behaviour that changes, so that it is decoupled.
		// This follows the design pattern that
		// Separate the parts which change.
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	public void display() {
		System.out.println("I am a real Mallard Duck.");
	}
}