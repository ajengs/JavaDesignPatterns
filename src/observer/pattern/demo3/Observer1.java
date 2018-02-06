package observer.pattern.demo3;

public class Observer1 implements IObserver{
	@Override
	public void update(String s, int value) {
		System.out.println("Observer1: detected change of value of " + s + " to:" + value);
	}
}
