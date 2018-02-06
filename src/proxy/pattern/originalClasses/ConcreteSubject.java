package proxy.pattern.originalClasses;

public class ConcreteSubject extends Subject {
	@Override
	public void doSomeWork() {
		System.out.println("I am from the concrete subject");
	}
}
