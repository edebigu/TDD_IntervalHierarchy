package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class ClosedOpenedIntervalClosedIntervalTest {
	
	private Interval createCloseOpenInterval(double fromEndPointValue, double untilEndPointValue) {
		
		return new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().fromEndPointClosed(fromEndPointValue).build()).untilEndPoint(new UntilEndPointBuilder().untilEndPointOpened(untilEndPointValue).build()).build();
		
	}
	
	private Interval createCloseInterval(double fromEndPointValue, double untilEndPointValue) {
		
		return new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().fromEndPointClosed(fromEndPointValue).build()).untilEndPoint(new UntilEndPointBuilder().untilEndPointClosed(untilEndPointValue).build()).build();
		
	}

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(1, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(3, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(0, 17);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(5, 10);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingLeftFromEndPointUntilEndpoint() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(0, 3);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(14, 22);
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createCloseInterval(3, 14);
		assertTrue(one.isIntersected(another));
	}


}
