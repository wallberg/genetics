package org.wallberg.genetics;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestGrid {

	@Test
	public void testConstructor() {
		Grid grid = new Grid(5,10);
		assertEquals(5, grid.getRows());
		assertEquals(10, grid.getCols());
		assertNotNull(grid.getSquare(1,1));
	}
	
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testBounds() {
		Grid grid = new Grid(1,1);
		grid.getSquare(1, 1);
	}

}
