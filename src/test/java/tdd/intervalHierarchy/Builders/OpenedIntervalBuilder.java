package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.OpenedInterval;

public class OpenedIntervalBuilder {
	private double min;
	private double max;
	
	public OpenedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}


	public OpenedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	public OpenedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	public OpenedInterval build() {
		assert min <= max;
		return new OpenedInterval(min, max);
	}

}
