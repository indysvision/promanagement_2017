package test01.mijloacelocomotoare;

public class Masina extends Vehicul{
	private int stergatoare = 2;
	int motor = 1;
	private static int numarPasageri = 4;
	
	public Masina(int nrroti, int scaune, int usi, int stergatoare, int motor) {
		super(nrroti, scaune, usi);
		this.stergatoare = stergatoare;
		this.motor = motor;
		System.out.println("constructor masina");
	}

	public Masina(int usi, int stergatoare, int motor) {
		super(usi);
		this.stergatoare = stergatoare;
		this.motor = motor;
	}

	public Masina(int stergatoare) {
		super();
		this.usi = 3;
		this.stergatoare = stergatoare;
		this.motor = 6;
		System.out.println("constructor masina cu cei mai putini parametri");
	}

	public static int getNumarPasageri() {
		return numarPasageri;
	}

	public static void setNumarPasageri(int numarPasageri) {
		Masina.numarPasageri = numarPasageri;
	}
	
	@Override
	public String toString() {
		return super.toString() + " si de fapt e masina cu " + stergatoare + " stergatoare, "
				+ motor + " motoare";
	}
	
	
}
