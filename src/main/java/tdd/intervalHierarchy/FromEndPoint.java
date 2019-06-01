package tdd.intervalHierarchy;

public class FromEndPoint extends EndPoint{

	public FromEndPoint(double value, boolean closePoint) {
		super(value, closePoint);
	}
	
	public boolean isOnTheLeft (EndPoint another)
	{		
		if (this.getValue() < another.getValue()) {
			return true;
		}
		if (this.getValue() == another.getValue())
		{
			return this.getClosedPoint() && another.getClosedPoint();
		}
		return false;
		
	}



}
