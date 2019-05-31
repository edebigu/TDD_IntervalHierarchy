package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.Interval;

public class IntervalBuilder {
	
	private double min;
	private double max;
	private boolean kind;
	
	
	
	public IntervalBuilder(){
		this.min = 0;
		this.max = 1;
		this.kind = true;
	}


	public IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	public IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	public IntervalBuilder kind(boolean kind) {
		this.kind = kind;
		return this;
	}
	
	public Interval build(){
		assert min <= max;
		return new Interval(min, max,kind);
	}
	
	

}
