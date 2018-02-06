package observer.pattern.demo;

public class ObserverPatternEx {

	public static void main(String[] args) {
		System.out.println("Modified Observer Pattern Demo");

		Subject sub1 = new Subject();
		Observer1 o1 = new Observer1();
		Observer2 o2 = new Observer2();
		
		sub1.register(o1);
		sub1.register(o2);
		
		sub1.setMyValue(5);
		sub1.setMyValue(25);
		sub1.unregister(o1);
		sub1.setMyValue(50);
	}
}
