package decorator.pattern.demo;

public class ConcreteComponent extends Component {
	@Override
	public void doJob() {
		System.out.println("I am a ConcreteComponent. I am closed for modification.");
	}
}
