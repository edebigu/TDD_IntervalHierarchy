package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.CompositeIntervalBuilder;

public class ClosedOpenedIntervalOpenedClosedIntervalTest {
    

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(1, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(3, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(0, 17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(5, 10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingPointLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(0, 3).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingtRight() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(14, 22).build();
		assertFalse(one.isIntersected(another));
	}
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new CompositeIntervalBuilder().createCloseOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenCloseInterval(3, 14).build();
		assertTrue(one.isIntersected(another));
	}


}
