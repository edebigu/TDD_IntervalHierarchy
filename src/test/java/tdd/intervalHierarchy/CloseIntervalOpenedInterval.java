package tdd.intervalHierarchy;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.intervalHierarchy.Builders.IntervalBuilder;

public class CloseIntervalOpenedInterval {
	
	@Test
	public void testIsIntersectedOverlapingLeft() {
		Interval one = new IntervalBuilder().min(3).max(14).kind(false).build();
		Interval another = new IntervalBuilder().min(1).max(7).kind(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		Interval one = new IntervalBuilder().min(3).max(14).kind(false).build();
		Interval another = new IntervalBuilder().min(3).max(7).kind(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		Interval one = new IntervalBuilder().min(3).max(14).kind(false).build();
		Interval another = new IntervalBuilder().min(0).max(17).kind(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		Interval one = new IntervalBuilder().min(3).max(14).kind(false).build();
		Interval another = new IntervalBuilder().min(5).max(10).kind(true).build();
		assertTrue(one.isIntersected(another));
	}


}
