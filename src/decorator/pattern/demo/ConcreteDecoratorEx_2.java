package decorator.pattern.demo;

public class ConcreteDecoratorEx_2 extends AbstractDecorator {
	public void doJob() {
		System.out.println("\nSTART EX_2");
		super.doJob();
		System.out.println("I am explicitly from Ex_2");
		System.out.println("END EX_2");
	}
}
