package tdd.intervalHierarchy;


public class OpenedInterval extends Interval{


	public OpenedInterval(double min, double max) {
		super(min,max);
	}
	
	@Override
	public boolean isIntersected(Interval another) {
		return super.isIntersected(another) || this.isEqual(another);
	}

	private boolean isEqual (Interval another) {
		return this.min == another.min && this.max == another.max;
	}
}
