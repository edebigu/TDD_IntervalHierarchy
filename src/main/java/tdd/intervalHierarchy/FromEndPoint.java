package tdd.intervalHierarchy;

public class FromEndPoint extends EndPoint{

	public FromEndPoint(double value, boolean closePoint) {
		super(value, closePoint);
	}
	
	public boolean isOnTheLeft (EndPoint another)
	{
		if (this.getClosedPoint() && another.getClosedPoint()) {
			return this.getValue() <= another.getValue();
		}
		else {
			return this.getValue() < another.getValue();
		}
		
	}



}
