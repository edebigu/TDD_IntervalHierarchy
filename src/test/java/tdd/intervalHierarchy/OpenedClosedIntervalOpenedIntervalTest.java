package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class OpenedClosedIntervalOpenedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(1).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(7).closedInterval(false).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(7).closedInterval(false).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(0).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(17).closedInterval(false).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(5).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(10).closedInterval(false).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(0).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(3).closedInterval(false).build()).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(14).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(22).closedInterval(false).build()).build();
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(false).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(false).build()).build();
		assertTrue(one.isIntersected(another));
	}

}
