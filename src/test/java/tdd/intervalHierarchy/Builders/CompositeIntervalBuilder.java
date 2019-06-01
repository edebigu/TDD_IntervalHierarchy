package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.Interval;

public class CompositeIntervalBuilder {

	private Interval interval;

	public CompositeIntervalBuilder createOpenInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPoint(new FromEndPointBuilder().fromEndPointOpened(fromEndPointValue).build())
				.untilEndPoint(new UntilEndPointBuilder().untilEndPointOpened(untilEndPointValue).build()).build();
		return this;

	}

	public CompositeIntervalBuilder createCloseInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPoint(new FromEndPointBuilder().fromEndPointClosed(fromEndPointValue).build())
				.untilEndPoint(new UntilEndPointBuilder().untilEndPointClosed(untilEndPointValue).build()).build();

		return this;

	}

	public CompositeIntervalBuilder createOpenCloseInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPoint(new FromEndPointBuilder().fromEndPointOpened(fromEndPointValue).build())
				.untilEndPoint(new UntilEndPointBuilder().untilEndPointClosed(untilEndPointValue).build()).build();

		return this;
	}

	public CompositeIntervalBuilder createCloseOpenInterval(double fromEndPointValue, double untilEndPointValue) {

		this.interval = new IntervalBuilder()
				.fromEndPoint(new FromEndPointBuilder().fromEndPointClosed(fromEndPointValue).build())
				.untilEndPoint(new UntilEndPointBuilder().untilEndPointOpened(untilEndPointValue).build()).build();
		
		return this;

	}
	
	public Interval build() {
		return this.interval;
	}

}
