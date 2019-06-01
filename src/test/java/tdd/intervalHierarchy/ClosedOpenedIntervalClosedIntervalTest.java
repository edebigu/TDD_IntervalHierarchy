package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.CompositeIntervalBuilder;

public class ClosedOpenedIntervalClosedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(1, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(3, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(5, 10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingLeftFromEndPointUntilEndpoint() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(0, 3).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(14, 22).build();
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		assertTrue(one.isIntersected(another));
	}


}
