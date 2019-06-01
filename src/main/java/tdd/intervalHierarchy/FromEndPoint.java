package tdd.intervalHierarchy;

public class FromEndPoint extends EndPoint{

	public FromEndPoint(double value, boolean closePoint) {
		super(value, closePoint);
	}
	
	public boolean isIncluded(FromEndPoint another) {
		if (this.getClosedPoint()) {
			return this.getValue() <= another.getValue();
		}
		else {
			return this.getValue() < another.getValue();
		}
	}
	
	public boolean isIncluded(UntilEndPoint another) {
		if (this.getClosedPoint() && another.getClosedPoint()) {
			return this.getValue() <= another.getValue();
		}
		else {
			return this.getValue() < another.getValue();
		}
	}



}
