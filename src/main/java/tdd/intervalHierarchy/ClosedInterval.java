package tdd.intervalHierarchy;

public class ClosedInterval extends Interval{

	public ClosedInterval(double min, double max) {
		super(min,max);
	}

	protected boolean isIncluded(double value) {
		return this.min <= value && value <= this.max;
	}

}
