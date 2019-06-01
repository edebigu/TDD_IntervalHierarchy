package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.FromEndPoint;
import tdd.intervalHierarchy.Interval;
import tdd.intervalHierarchy.UntilEndPoint;

public class IntervalBuilder {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;
	
	
	
	public IntervalBuilder(){
		this.fromEndPoint = new FromEndPoint(0,true);
		this.untilEndPoint = new UntilEndPoint(1,true);
	}


	public IntervalBuilder fromEndPoint(double value, boolean isClosed) {
		this.fromEndPoint = new FromEndPoint (value,isClosed);
		return this;
	}

	public IntervalBuilder untilEndPoint(double value, boolean isClosed) {
		this.untilEndPoint = new UntilEndPoint (value,isClosed);
		return this;
	}
	
	public Interval build(){
		assert this.fromEndPoint.getValue() <= this.untilEndPoint.getValue();
		return new Interval(fromEndPoint,untilEndPoint);
	}
	
	

}
