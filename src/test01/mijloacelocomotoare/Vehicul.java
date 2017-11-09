package test01.mijloacelocomotoare;

public class Vehicul {
	protected int roti = 4;
	protected int scaune = 4;
	protected int usi = 5; 
	
	@Override
	public String toString() {
		return "Vehicul cu " + usi + " usi, " + scaune + " scaune, " + roti + " roti";
	}

	public Vehicul(int nrroti, int scaune, int usi) {
		System.out.println("constructor vehicul");
		roti = nrroti;
		this.scaune = scaune;
		this.usi = usi;
	}

	public Vehicul(int usi) {
		this.usi = usi;
	}

	public Vehicul() {
		System.out.println("constructor vehicul");
	}


	public int getRoti() {
		return roti;
	}

	public void setRoti(int roti) {
		this.roti = roti; 
	}

	public int getScaune() {
		return scaune;
	}

	public void setScaune(int scaune) {
		this.scaune = scaune;
	}

	public int getUsi() {
		return usi;
	}

	public void setUsi(int usi) {
		this.usi = usi;
	}
	
	@Override
	public boolean equals(Object obiectulComparat) {
		if (this.roti == ((Vehicul)obiectulComparat).roti &&
				this.scaune == ((Vehicul)obiectulComparat).scaune ) {
			return true;
		}
		return false;		
	}
	
}
