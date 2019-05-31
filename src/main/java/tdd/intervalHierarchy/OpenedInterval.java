package tdd.intervalHierarchy;


public class OpenedInterval extends Interval{


	public OpenedInterval(double min, double max) {
		super(min,max);
	}


	protected boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}

}
