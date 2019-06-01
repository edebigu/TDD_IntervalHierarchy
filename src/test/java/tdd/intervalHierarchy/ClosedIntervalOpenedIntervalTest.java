package tdd.intervalHierarchy;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.IntervalBuilder;

public class ClosedIntervalOpenedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(1, true).untilEndPoint(7, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(7, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(0, true).untilEndPoint(17, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(5, true).untilEndPoint(10, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(0, true).untilEndPoint(3, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(14, true).untilEndPoint(22, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new IntervalBuilder().fromEndPoint(3, false).untilEndPoint(14, false).build();
		Interval another = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		assertTrue(one.isIntersected(another));
	}


}
