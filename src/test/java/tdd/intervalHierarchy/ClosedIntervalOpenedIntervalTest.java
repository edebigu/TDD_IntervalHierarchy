package tdd.intervalHierarchy;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import tdd.intervalHierarchy.Builders.CompositeIntervalBuilder;

public class ClosedIntervalOpenedIntervalTest {
	


	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(1, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(3, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(0, 17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(5, 10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(0, 3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(14, 22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new CompositeIntervalBuilder().createCloseInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		assertTrue(one.isIntersected(another));
	}


}
