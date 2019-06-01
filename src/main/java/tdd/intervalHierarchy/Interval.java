package tdd.intervalHierarchy;

public class Interval {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;
	
	public Interval(FromEndPoint fromEndPoint,UntilEndPoint untilEndPoint) {
		this.fromEndPoint = fromEndPoint;
		this.untilEndPoint = untilEndPoint;
	}
	
	public boolean isIntersected(Interval another) {

		
		if (!this.fromEndPoint.getClosedInterval() && !another.fromEndPoint.getClosedInterval() && !this.untilEndPoint.getClosedInterval() &&
				!another.untilEndPoint.getClosedInterval()) {
			
			return this.isIncluded(another.fromEndPoint) || this.isIncluded(another.untilEndPoint) ||
			another.isIncluded(this.fromEndPoint) || this.isEqual(another);
		}
		else {
			
			return this.isIncluded(another.fromEndPoint) || this.isIncluded(another.untilEndPoint) ||
					another.isIncluded(this.fromEndPoint);
		}

	}
	
	private boolean isEqual (Interval another) {
		return this.fromEndPoint.getValue() == another.fromEndPoint.getValue() && this.untilEndPoint.getValue() == another.untilEndPoint.getValue();
	}
	
	private boolean isIncluded (EndPoint another) {
		
		
		if (this.fromEndPoint.getClosedInterval())
		{
			if (another.getClosedInterval()) {
				return this.fromEndPoint.getValue() <= another.getValue() && another.getValue() <= this.untilEndPoint.getValue();
			}
			else {
				return this.fromEndPoint.getValue() < another.getValue() && another.getValue() < this.untilEndPoint.getValue();
			}
		}
		else {
			if (another.getClosedInterval()) {
				return this.fromEndPoint.getValue()<  another.getValue() && another.getValue() < this.untilEndPoint.getValue();
			}
			else {
				return this.fromEndPoint.getValue() < another.getValue() && another.getValue() < this.untilEndPoint.getValue();
			}
			
		}
	
		
	}

}
