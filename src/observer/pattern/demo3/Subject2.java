package observer.pattern.demo3;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int myValue;
	
	public void setMyValue(int myValue) {
		this.myValue = myValue;
		notifyObservers(myValue);
	}

	@Override
	public void register(IObserver o) {
		observerList.add(o);
	}

	@Override
	public void unregister(IObserver o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers(int updatedValue) {
		for(int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(this.getClass().getSimpleName(), updatedValue);
		}
	}

}
