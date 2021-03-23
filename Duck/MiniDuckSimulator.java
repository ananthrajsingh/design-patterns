public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		System.out.println("\n");

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehaviour(new FlyWithWings());
		model.performFly();
	}
}