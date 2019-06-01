package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class ClosedOpenedIntervalOpenedIntervalTest {
	
    private Interval createCloseOpenInterval(double fromEndPointValue, double untilEndPointValue) {
		
		return new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().fromEndPointClosed(fromEndPointValue).build()).untilEndPoint(new UntilEndPointBuilder().untilEndPointOpened(untilEndPointValue).build()).build();
		
	}
    
	private Interval createOpenInterval(double fromEndPointValue, double untilEndPointValue) {
		
		return new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().fromEndPointOpened(fromEndPointValue).build()).untilEndPoint(new UntilEndPointBuilder().untilEndPointOpened(untilEndPointValue).build()).build();
		
	}


	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(1, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(3, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(0, 17);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(5, 10);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(0, 3);
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(14, 22);
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = this.createCloseOpenInterval(3, 14);
		Interval another = this.createOpenInterval(3, 14);
		assertTrue(one.isIntersected(another));
	}

}
