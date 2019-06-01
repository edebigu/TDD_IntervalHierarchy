package tdd.intervalHierarchy;

public class UntilEndPoint extends EndPoint{

	public UntilEndPoint(double value, boolean closedPoint) {
		super(value, closedPoint);
	}
	
	boolean isIncluded(FromEndPoint another) {
		if (this.getClosedPoint() && another.getClosedPoint()) {
			return this.getValue() >= another.getValue();
		}
		else {
			return this.getValue() > another.getValue();
		}
	}
	
	boolean isIncluded(UntilEndPoint another) {
		if (this.getClosedPoint() && another.getClosedPoint()) {
			return this.getValue() >= another.getValue();
		}
		else {
			return this.getValue() > another.getValue();
		}
		}
	




}
