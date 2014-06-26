package ch04_test;

public class GasMilage {
	private int distance;
	private int gas;
	private double mpg;
	
	public GasMilage (int distanceM, int gasG){
		distance = distanceM;
		gas = gasG;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public double getMpg() {
		return mpg;
	}

	public void setMpg() {
		mpg = (double) distance / gas;
	}
	

	
	
}