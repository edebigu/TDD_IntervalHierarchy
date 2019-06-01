package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class ClosedOpenedIntervalOpenedClosedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(1).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(7).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(7).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(0).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(17).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(5).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(10).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingPointLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(0).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(3).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingtRight() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(14).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(22).closedInterval(true).build()).build();
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}


}