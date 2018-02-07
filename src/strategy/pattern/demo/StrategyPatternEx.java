package strategy.pattern.demo;

import java.io.IOException;
import java.util.Scanner;
import strategy.pattern.choices.*;
import strategy.pattern.contextofchoice.*;

public class StrategyPatternEx {

	public static void main(String[] args) {
		System.out.println("***Strategy Pattern Demo***");
		Scanner input = new Scanner(System.in);
		String input1, input2;
		
		try {
			for(int i = 0; i < 2; i++) {
				System.out.println("Enter an integer: ");
				input1 = input.nextLine();
				System.out.println("Enter another integer: ");
				input2 = input.nextLine();
				System.out.println("Menu: ");
				System.out.println("1. Print sum of the numbers");
				System.out.println("2. Concatenate the numbers");
				String option = input.nextLine();
				
				chooseStrategy(input1, input2, option);
			}
		} finally {
			input.close();
		}
		System.out.println("End of Strategy Pattern");
	}
	
	private static void chooseStrategy(String input1, String input2, String option) {
		IChoice choosen;
		Context context = new Context();
		if(option.equals("1")) {
			choosen = new FirstChoice();
		} else {
			choosen = new SecondChoice();
		}
		
		context.setChoice(choosen);
		context.showChoice(input1, input2);
	}

}
