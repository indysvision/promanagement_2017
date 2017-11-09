package test01.mijloacelocomotoare;

public class AvionCuMotor extends Vehicul{
	private int aripi = 2;

	@Override
	public String toString() {
		return "Avion cu " + roti + " roti, " + usi + " usi, " + scaune + 
				" scaune, " + aripi + " aripi";
	}

	public AvionCuMotor(int nrroti, int scaune, int usi, int aripi) {
		super(nrroti, scaune, usi);
		this.aripi = aripi;
	}

	public AvionCuMotor() {
		super();
	}

	public AvionCuMotor(int usi) {
		super(usi);
	}
	
	
}
