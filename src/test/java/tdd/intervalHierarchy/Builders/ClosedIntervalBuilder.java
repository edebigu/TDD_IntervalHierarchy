package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.ClosedInterval;
import tdd.intervalHierarchy.Interval;

public class ClosedIntervalBuilder extends IntervalBuilder{

	
	public ClosedIntervalBuilder(){
		super();
	}

	@Override
	public Interval build() {
		assert min <= max;
		return new ClosedInterval(min, max);
	}

	
}
