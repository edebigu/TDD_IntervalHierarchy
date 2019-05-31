package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.ClosedInterval;

public class ClosedIntervalBuilder {

	private double min;
	
	private double max;
	
	public ClosedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	public ClosedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	public ClosedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	public ClosedInterval build() {
		assert min <= max;
		return new ClosedInterval(min, max);
	}

	
}
