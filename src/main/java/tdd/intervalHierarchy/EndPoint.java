package tdd.intervalHierarchy;

public class EndPoint {
	
	private double value;


	private boolean closePoint;

	public EndPoint(double value, boolean closedInterval) {
		this.value = value;
		this.closePoint = closedInterval;
	}
	
	public boolean getClosedPoint() {
		return closePoint;
	}

	public void setClosedPoint(boolean closedPoint) {
		this.closePoint = closedPoint;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
	

}
