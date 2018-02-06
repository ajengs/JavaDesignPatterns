package singleton.pattern.demo;

public class MakeACaptain {
	private static MakeACaptain _captain;
	private MakeACaptain() {}
	
	public static synchronized MakeACaptain getCaptain() {
		if(_captain == null) {
			_captain = new MakeACaptain();
			System.out.println("New captain selected for our team");
		} else {
			System.out.println("You already have a captain for your team");
			System.out.println("Send him for the toss");
		}
		return _captain;
	}
}
