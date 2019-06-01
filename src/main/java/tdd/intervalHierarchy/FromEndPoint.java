package tdd.intervalHierarchy;

public class FromEndPoint extends EndPoint{

	public FromEndPoint(double value, boolean closedInterval) {
		super(value, closedInterval);
	}
	
	public boolean isIncluded(FromEndPoint another) {
		if (this.getClosedInterval()) {
			return this.getValue() <= another.getValue();
		}
		else {
			return this.getValue() < another.getValue();
		}
	}
	
	public boolean isIncluded(UntilEndPoint another) {
		if (this.getClosedInterval() && another.getClosedInterval()) {
			return this.getValue() <= another.getValue();
		}
		else {
			return this.getValue() < another.getValue();
		}
	}



}
