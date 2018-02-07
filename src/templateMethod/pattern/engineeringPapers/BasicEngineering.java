package templateMethod.pattern.engineeringPapers;

public abstract class BasicEngineering {
	public void papers() {
		math();
		softSkills();
		specialPaper();
	}
	
	private void math() {
		System.out.println("Mathematics is mandatory subject");
	}
	
	private void softSkills() {
		System.out.println("Soft skills subject is also mandatory");
	}
	
	public abstract void specialPaper();
}
