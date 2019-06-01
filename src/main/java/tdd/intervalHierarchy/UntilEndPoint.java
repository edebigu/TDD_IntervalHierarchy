package tdd.intervalHierarchy;

public class UntilEndPoint extends EndPoint {

	public UntilEndPoint(double value, boolean closedPoint) {
		super(value, closedPoint);
	}

	public boolean isOnTheRigth(EndPoint another)
	{
		if (this.getValue() > another.getValue()) {
			return true;
		}
		if (this.getValue() == another.getValue())
		{
			return this.getClosedPoint() && another.getClosedPoint();
		}
		return false;
	}

}
