package tdd.intervalHierarchy;

import org.junit.Test;

import static org.junit.Assert.*;
import tdd.intervalHierarchy.Builders.CompositeIntervalBuilder;


public class ClosedIntervalTest {
	

	@Test
	public void testIsIntersectedOverlapingOnTheLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(1, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingOnTheRigth() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(5, 18).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingWhenMinsAreEquals() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(3, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingWhenMaxsAreEquals() {

		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(5, 14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedWhenAreEquals() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		assertTrue(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(5, 10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingOnTheLeftWhenMinAreEqualsMax() {

		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 3).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingRightWhenMaxsAreEqualsMin() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(14, 22).build();
		assertTrue(one.isIntersected(another));
	}
	
	
	@Test
	public void testIsIntersectedNotOverlapingOnTheLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingOnTheRight() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(16, 22).build();
		assertFalse(one.isIntersected(another));
	}
	
	
}
