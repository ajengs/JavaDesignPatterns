package proxy.pattern.proxyClasses;
import proxy.pattern.originalClasses.*;

public class Proxy extends Subject {
	ConcreteSubject cs;
	
	@Override
	public void doSomeWork() {
		System.out.println("Proxy call is happening now");
		//Lazy initialization
		if(cs == null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}
}
