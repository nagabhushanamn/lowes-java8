package com.patterns;

import java.util.ArrayList;
import java.util.List;

interface Command {
	boolean execute();
}

interface Move {
	boolean walk();

	boolean run();

	boolean jump();
}

class WalkCommand implements Command {
	Move move;

	public WalkCommand(Move move) {
		super();
		this.move = move;
	}

	@Override
	public boolean execute() {
		return move.walk();
	}
}

class RunCommand implements Command {
	Move move;

	public RunCommand(Move move) {
		super();
		this.move = move;
	}

	@Override
	public boolean execute() {
		return move.run();
	}
}

class JumpCommand implements Command {
	Move move;

	public JumpCommand(Move move) {
		super();
		this.move = move;
	}

	@Override
	public boolean execute() {
		return move.jump();
	}
}

class Person implements Move {

	@Override
	public boolean walk() {
		System.out.println("Walking...");
		return true;
	}

	@Override
	public boolean run() {
		System.out.println("Running...");
		return true;
	}

	@Override
	public boolean jump() {
		System.out.println("Jumping...");
		return true;
	}

}

class Commands {
	private final List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void execute() {
		commands.forEach(Command::execute);
	}
}

public class Command_Pattern_OO {

	public static void main(String[] args) {

		Person person = new Person();
		Commands commands = new Commands();
		commands.addCommand(new WalkCommand(person));
		commands.addCommand(new RunCommand(person));
		commands.addCommand(new JumpCommand(person));

		commands.execute(); //

	}

}
