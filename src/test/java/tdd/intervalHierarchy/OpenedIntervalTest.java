package tdd.intervalHierarchy;

import static org.junit.Assert.*;
import org.junit.Test;

import tdd.intervalHierarchy.Builders.OpenedIntervalBuilder;

public class OpenedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(0).max(3).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedNotOverlapingRight() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedEqualInterval() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}

}
