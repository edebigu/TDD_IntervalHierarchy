package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.Interval;
import tdd.intervalHierarchy.OpenedInterval;

public class OpenedIntervalBuilder  extends IntervalBuilder {
	
	public OpenedIntervalBuilder(){
		super();
	}

	@Override
	public Interval build() {
		assert min <= max;
		return new OpenedInterval(min, max);
	}

}
