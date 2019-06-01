package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.intervalHierarchy.Builders.IntervalBuilder;

public class ClosedIntervalTest extends TestCase {

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(1, true).untilEndPoint(7, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(7, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(7, true).untilEndPoint(17, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(0, true).untilEndPoint(17, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(5, true).untilEndPoint(10, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(0, true).untilEndPoint(2, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().fromEndPoint(3, true).untilEndPoint(14, true).build();
		Interval another = new IntervalBuilder().fromEndPoint(16, true).untilEndPoint(22, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	
}
