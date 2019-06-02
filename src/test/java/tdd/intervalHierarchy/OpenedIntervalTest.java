package tdd.intervalHierarchy;

import org.junit.Test;
import static org.junit.Assert.*;

import tdd.intervalHierarchy.Builders.CompositeIntervalBuilder;


public class OpenedIntervalTest{


	@Test
	public void testIsIntersectedOverlapingOnTheLeft() {
		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(1, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingOnTheRigth() {
		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(5, 18).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingWhenMinsAreEquals() {

		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(3, 7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingWhenMaxsAreEquals() {

		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(5, 14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedWhenAreEquals() {

		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingBoth() {

		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(0, 17).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlapingInside() {

		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(5, 10).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedNotOverlapingOnTheLeftWhenMinAreEqualsMax() {

		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(0, 3).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedNotOverlapingRightWhenMaxsAreEqualsMin() {
		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(14, 22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingOnTheLeft() {
		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(0, 2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingOnTheRight() {
		Interval one = new CompositeIntervalBuilder().createOpenInterval(3, 14).build();
		Interval another = new CompositeIntervalBuilder().createOpenInterval(15, 20).build();
		assertFalse(one.isIntersected(another));
	}
	
	


}
