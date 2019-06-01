package tdd.intervalHierarchy;

public class Interval {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;
	
	public Interval(FromEndPoint fromEndPoint,UntilEndPoint untilEndPoint) {
		this.fromEndPoint = fromEndPoint;
		this.untilEndPoint = untilEndPoint;
	}
	
	public boolean isIntersected(Interval another) {
		return this.fromEndPoint.isIncluded(another.fromEndPoint) && this.untilEndPoint.isIncluded(another.fromEndPoint) ||
				this.fromEndPoint.isIncluded(another.untilEndPoint) && this.untilEndPoint.isIncluded(another.untilEndPoint) ||
				another.fromEndPoint.isIncluded(this.fromEndPoint) && another.untilEndPoint.isIncluded(this.fromEndPoint) || 
				this.isEqual(another);

	}
	
	private boolean isEqual (Interval another) {
		return this.fromEndPoint.getValue() == another.fromEndPoint.getValue() && this.untilEndPoint.getValue() == another.untilEndPoint.getValue();
	}

}
