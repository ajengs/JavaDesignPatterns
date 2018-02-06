package observer.pattern.demo;

public class ObserverPatternEx {
	public static void main(String args[]) {
		Subject s1 = new Subject();
		Observer o1 = new Observer();
		s1.register(o1);
		
		System.out.println("Setting flag to 5");
		s1.setFlag(5);
		System.out.println("Setting flag to 25");
		s1.setFlag(25);
		s1.unregister(o1);
		System.out.println("Setting flag to 50");
		s1.setFlag(50);
	}
}
