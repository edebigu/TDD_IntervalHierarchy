package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.Close;
import tdd.intervalHierarchy.FromEndPoint;
import tdd.intervalHierarchy.Interval;
import tdd.intervalHierarchy.UntilEndPoint;

public class IntervalBuilder {
	
	private FromEndPoint fromEndPoint;
	private UntilEndPoint untilEndPoint;
	
	
	
	public IntervalBuilder(){
		this.fromEndPoint = new FromEndPoint(0, new Close());
		this.untilEndPoint = new UntilEndPoint(2, new Close());
	}


	public IntervalBuilder fromEndPoint(FromEndPoint fromEndPoint) {
		this.fromEndPoint = fromEndPoint;
		return this;
	}
	
	public IntervalBuilder fromEndPointIncluded(FromEndPoint fromEndPointIncluded) {
		this.fromEndPoint = fromEndPointIncluded;
		return this;
	}

	public IntervalBuilder untilEndPoint(UntilEndPoint untilEndPoint) {
		this.untilEndPoint = untilEndPoint;
		return this;
	}
	
	public IntervalBuilder untilEndPointIncluded(UntilEndPoint untilEndPointIncluded) {
		this.untilEndPoint = untilEndPointIncluded;
		return this;
	}
	
	public Interval build(){
		assert this.fromEndPoint.getValue() <= this.untilEndPoint.getValue();
		return new Interval(fromEndPoint,untilEndPoint);
	}
	
	

}
