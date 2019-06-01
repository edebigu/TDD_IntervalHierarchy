package tdd.intervalHierarchy;

public class UntilEndPoint extends EndPoint{

	public UntilEndPoint(double value, boolean closedInterval) {
		super(value, closedInterval);
	}
	
	boolean isIncluded(FromEndPoint another) {
		if (this.getClosedInterval() && another.getClosedInterval()) {
			return this.getValue() >= another.getValue();
		}
		else {
			return this.getValue() > another.getValue();
		}
	}
	
	boolean isIncluded(UntilEndPoint another) {
		if (this.getClosedInterval() && another.getClosedInterval()) {
			return this.getValue() >= another.getValue();
		}
		else {
			return this.getValue() > another.getValue();
		}
		}
	




}
