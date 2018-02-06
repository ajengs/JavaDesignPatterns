package observer.pattern.demo3;

public class Observer3 implements IObserver{
	public void update(String s, int value) {
		System.out.println("Observer3: receiveng update from " + s + ". value changed to" + value);
	}
}
