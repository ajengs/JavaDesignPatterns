package templateMethod.pattern.demo;

import templateMethod.pattern.engineeringPapers.*;

public class TemplateMethodPatternEx {
	public static void main(String args[]) {
		System.out.println("Computer science");
		BasicEngineering bs = new ComputerScience();
		bs.papers();
		System.out.println();
		
		System.out.println("Electronics");
		bs = new Electronics();
		bs.papers();
	}
}
