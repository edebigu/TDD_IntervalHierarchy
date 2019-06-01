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


	public IntervalBuilder fromEndPoint(FromEndPoint fromEndPoint) {
		this.fromEndPoint = fromEndPoint;
		return this;
	}

	public IntervalBuilder untilEndPoint(UntilEndPoint untilEndPoint) {
		this.untilEndPoint = untilEndPoint;
		return this;
	}
	
	public Interval build(){
		assert this.fromEndPoint.getValue() <= this.untilEndPoint.getValue();
		return new Interval(fromEndPoint,untilEndPoint);
	}
	
	

}
