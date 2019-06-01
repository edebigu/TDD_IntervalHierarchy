package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;
import tdd.intervalHierarchy.Builders.CompositeIntervalBuilder;


public class ClosedIntervalTest extends TestCase {
	

	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(1, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(3, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(7, 17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(5, 10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(16, 22).build();
		assertFalse(one.isIntersected(another));
	}
	
	
}
