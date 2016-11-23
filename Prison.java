package medev_tp;

public class Prison extends Case{
	// une sous-classe de Case
	private int caution; // caution

	public int getCaution() {
		return caution;
	}


	public void setCaution(int caution) {
		this.caution = caution;
	}
	
	public String toString(){
		String cautionString = "" + getCaution(); // transforme caution de int  a String
		String retourne = getNom() + " " + cautionString;
		return retourne;
	}
}

