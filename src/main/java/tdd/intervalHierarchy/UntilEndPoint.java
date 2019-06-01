package tdd.intervalHierarchy;

public class UntilEndPoint extends EndPoint {

	public UntilEndPoint(double value, boolean closedPoint) {
		super(value, closedPoint);
	}

	public boolean isOnTheRigth(EndPoint another)
	{
		if (this.getClosedPoint() && another.getClosedPoint()) {
			return this.getValue() >= another.getValue();
		} else {
			return this.getValue() > another.getValue();
		}
	}

}
