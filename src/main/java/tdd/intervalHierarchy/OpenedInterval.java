package tdd.intervalHierarchy;


public class OpenedInterval {

	private double min;
	private double max;

	public OpenedInterval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isIncluded(another.min) || this.isIncluded(another.max) || another.isIncluded(this.min);
	}

	private boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}

}
