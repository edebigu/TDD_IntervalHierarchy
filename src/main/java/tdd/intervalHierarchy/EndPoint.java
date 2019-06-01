package tdd.intervalHierarchy;

public class EndPoint {
	
	private double value;


	private boolean closedInterval;

	public EndPoint(double value, boolean closedInterval) {
		this.value = value;
		this.closedInterval = closedInterval;
	}
	
	public boolean getClosedInterval() {
		return closedInterval;
	}

	public void setClosedInterval(boolean closedInterval) {
		this.closedInterval = closedInterval;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
	

}
