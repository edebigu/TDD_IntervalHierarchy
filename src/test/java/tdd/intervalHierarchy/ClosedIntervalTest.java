package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.intervalHierarchy.Builders.FromEndPointBuilder;
import tdd.intervalHierarchy.Builders.IntervalBuilder;
import tdd.intervalHierarchy.Builders.UntilEndPointBuilder;

public class ClosedIntervalTest extends TestCase {
	
	private Interval createCloseInterval(double fromEndPointValue, double untilEndPointValue) {
		
		return new IntervalBuilder().fromEndPoint(new FromEndPointBuilder().fromEndPointClosed(fromEndPointValue).build()).untilEndPoint(new UntilEndPointBuilder().untilEndPointClosed(untilEndPointValue).build()).build();
		
	}

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(1, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(3, 7);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(3, 14);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(7, 17);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(0, 17);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(5, 10);
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(0, 2);
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = this.createCloseInterval(3, 14);
		Interval another = this.createCloseInterval(16, 22);
		assertFalse(one.isIntersected(another));
	}
	
	
}
