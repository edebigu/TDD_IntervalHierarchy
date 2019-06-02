package tdd.intervalHierarchy;

public class Interval {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;
	
	public Interval(FromEndPoint fromEndPoint,UntilEndPoint untilEndPoint) {
		this.fromEndPoint = fromEndPoint;
		this.untilEndPoint = untilEndPoint;
	}
	
	public boolean isIntersected(Interval another) {
		return this.fromEndPoint.isIncluded(another.untilEndPoint) && this.untilEndPoint.isIncluded(another.fromEndPoint);
	}
	
	private boolean isEqual (Interval another) {
		return this.fromEndPoint.getValue() == another.fromEndPoint.getValue() && this.untilEndPoint.getValue() == another.untilEndPoint.getValue();
	}

}
