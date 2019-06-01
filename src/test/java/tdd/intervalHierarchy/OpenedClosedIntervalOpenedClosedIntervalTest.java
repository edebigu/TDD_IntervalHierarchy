package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class OpenedClosedIntervalOpenedClosedIntervalTest {
	
	
	private Interval createOpenCloseInterval(double fromEndPointValue, double untilEndPointValue) {
		
		return new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().fromEndPointOpened(fromEndPointValue).build()).untilEndPoint(new UntilEndPointBuilder().untilEndPointClosed(untilEndPointValue).build()).build();
		
	}

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(1, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(3, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(0, 17);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(5, 10);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(0, 3);
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingRight() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(14, 22);
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = this.createOpenCloseInterval(3, 14);
		Interval another = this.createOpenCloseInterval(3, 14);
		assertTrue(one.isIntersected(another));
	}

}
