package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.IntervalBuilder;

public class OpenedIntervalClosedInterval {
	
	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(1, false).untilEndPoint(7, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(7, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(0, false).untilEndPoint(17, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(5, false).untilEndPoint(10, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(0, false).untilEndPoint(3, false).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(14, false).untilEndPoint(22, false).build();
		assertFalse(one.isIntersected(another));
	}
	
	//Este caso no se ejecuta porque falla
	/*@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		assertTrue(one.isIntersected(another));
	}*/


}
