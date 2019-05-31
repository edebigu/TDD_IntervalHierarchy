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
	

	

}
