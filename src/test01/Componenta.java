package test01;

public class Componenta {
	
	private static Componenta instance = null;

	private Componenta() {	
	}
	
	public static Componenta getInstance() {
		if (instance == null) {
			instance = new Componenta();
		}
		return instance;	
	}
}
