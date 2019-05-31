package tdd.intervalHierarchy;

public class Interval {
	
	protected double min;
	protected double max;
	protected boolean kind;
	
	public Interval(double min, double max, boolean kind) {
		this.min = min;
		this.max = max;
		this.kind = kind;
	}
	
	public boolean isIntersected(Interval another) {
		boolean isIncluded = this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
		if (this.kind) {
			return isIncluded || this.isEqual(another);
		}
		else {
			return isIncluded;
		}

	}
	
	private boolean isEqual (Interval another) {
		return this.min == another.min && this.max == another.max;
	}
	
	private boolean isIncluded (double value) {
		if (!kind) {
			return this.min <= value && value <= this.max;
		}
		else {
			return this.min < value && value < this.max;
		}
		
	}

}
