package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.Interval;

public class CompositeIntervalBuilder {

	private Interval interval;

	public CompositeIntervalBuilder createOpenInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPoint(new FromEndPointBuilder().fromEndPoint(fromEndPointValue).build())
				.untilEndPoint(new UntilEndPointBuilder().untilEndPoint(untilEndPointValue).build()).build();
		return this;

	}

	public CompositeIntervalBuilder createCloseInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPointIncluded(new FromEndPointBuilder().fromEndPointIncluded(fromEndPointValue).build())
				.untilEndPointIncluded(new UntilEndPointBuilder().untilEndPointIncluded(untilEndPointValue).build()).build();

		return this;

	}

	public CompositeIntervalBuilder createOpenCloseInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPoint(new FromEndPointBuilder().fromEndPoint(fromEndPointValue).build())
				.untilEndPointIncluded(new UntilEndPointBuilder().untilEndPointIncluded(untilEndPointValue).build()).build();

		return this;
	}

	public CompositeIntervalBuilder createCloseOpenInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPointIncluded(new FromEndPointBuilder().fromEndPointIncluded(fromEndPointValue).build())
				.untilEndPoint(new UntilEndPointBuilder().untilEndPoint(untilEndPointValue).build()).build();
		
		return this;

	}
	
	public Interval build() {
		return this.interval;
	}

}
