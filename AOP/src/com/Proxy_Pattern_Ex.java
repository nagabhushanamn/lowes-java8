package com;

class Logging{
	public void doLog() {
		System.out.println("logging..");
	}
}

class Security{
	public void doSec() {
		System.out.println("security");
	}
}

class Lowes {
	public void doTraining() {
		System.out.println("doing training...");
	}
}

// CGLIB

class LowesProxy extends Lowes{
	private Logging logging=new Logging();
	private Security sec=new Security();
	@Override
	public void doTraining() {
		logging.doLog();
		sec.doSec();
		super.doTraining();
		logging.doLog();
	}
}

public class Proxy_Pattern_Ex {

	public static void main(String[] args) {

		LowesProxy lowesProxy=new LowesProxy();
		lowesProxy.doTraining();

	}

}
