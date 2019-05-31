package tdd.intervalHierarchy;

import static org.junit.Assert.*;
import org.junit.Test;

import tdd.intervalHierarchy.Builders.OpenedIntervalBuilder;


public class OpenedIntervalTest {

	@Test
	public void testIsIntersectedOverlapingLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEqualsMin() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingBoth() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingInside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(0).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	

	

}
