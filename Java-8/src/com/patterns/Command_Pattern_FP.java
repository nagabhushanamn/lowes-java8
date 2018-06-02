package com.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class FunctionalCommands {
	private List<Supplier<Boolean>> commands = new ArrayList<>();

	public void addCommand(Supplier<Boolean> command) {
		commands.add(command);
	}

	public void execute() {
		commands.forEach(Supplier::get);
	}
}

public class Command_Pattern_FP {

	public static void main(String[] args) {

		Person person = new Person();
		FunctionalCommands fc = new FunctionalCommands();
		fc.addCommand(() -> person.walk());
		fc.addCommand(() -> person.run());
		fc.addCommand(() -> person.jump());
		
		fc.execute();

	}

}
