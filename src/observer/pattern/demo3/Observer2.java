package observer.pattern.demo3;

public class Observer2 implements IObserver {
	@Override
	public void update(String s, int value) {
		System.out.println("Observer2: detected " + s + " changed value to " + value);
	}
}
