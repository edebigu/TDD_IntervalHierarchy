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
		boolean isIncluded = this.isIncluded(another.min, another.kind) ||
				this.isIncluded(another.max, another.kind)||
				another.isIncluded(this.min, another.kind);
		if (this.kind || another.kind) {
			return isIncluded || this.isEqual(another);
		}
		else {
			return isIncluded;
		}

	}
	
	private boolean isEqual (Interval another) {
		return this.min == another.min && this.max == another.max;
	}
	
	private boolean isIncluded (double value, boolean kind) {
		if (!this.kind && !kind) {
			return this.min <= value && value <= this.max;
		}
		else if (this.kind && kind) {
			return this.min < value && value < this.max;
		}
		
		else if(!this.kind && kind) {
			return this.min < value && value <=this.max;
		}

		
		return false;
		
	}

}
