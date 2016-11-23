package medev_tp;

public class Depart extends Case{
	// une sous-classe de Case
	private int gain; // gain
	
	public String toString(){
		String gainString = "" + getGain(); // transforme gain de int a String
		String retourne = getNom() + " " + gainString;
		return retourne;
	}

	public int getGain() {
		return gain;
	}
	
	public void setGain(int gain) {
		this.gain = gain;
	}
}
