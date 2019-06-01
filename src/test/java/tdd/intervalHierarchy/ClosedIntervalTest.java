package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class ClosedIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(1).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(7).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(7).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(7).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(17).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(0).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(17).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(5).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(10).closedInterval(true).build()).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(0).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(2).closedInterval(true).build()).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(3).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(14).closedInterval(true).build()).build();
		Interval another = new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().value(16).closedInterval(true).build()).untilEndPoint(new UntilEndPointBuilder().value(22).closedInterval(true).build()).build();
		assertFalse(one.isIntersected(another));
	}
	
	
}
