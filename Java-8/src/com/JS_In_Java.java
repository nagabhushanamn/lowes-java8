package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JS_In_Java {

	public static void main(String[] args) {

		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		try {

			Bindings bind = se.getBindings(ScriptContext.ENGINE_SCOPE);
			se.eval(new FileReader("js/hello.js"));
			Invocable invocable = (Invocable) se;
			String name = "Nag";
			invocable.invokeFunction("init");
			invocable.invokeFunction("init");
			invocable.invokeFunction("init");
			invocable.invokeFunction("init");

		} catch (ScriptException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

}
