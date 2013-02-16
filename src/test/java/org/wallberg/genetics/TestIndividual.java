package org.wallberg.genetics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.wallberg.genetics.Individual.Allele;
import org.wallberg.genetics.Individual.Gender;

public class TestIndividual {

	@Test
	public void testConstructor() {
		Individual i1 = new Individual(Allele.Dominant, Allele.Dominant, Gender.Male);
		assertEquals(Allele.Dominant, i1.getA1());
		assertEquals(Allele.Dominant, i1.getA2());
		assertEquals(Gender.Male, i1.getGender());
		assertEquals(0l, i1.getAge());
	}
	
	@Test
	public void testBreed() {
		Individual i1 = new Individual(Allele.Dominant, Allele.Dominant, Gender.Male);
		Individual i2 = new Individual(Allele.Dominant, Allele.Dominant, Gender.Female);

		Individual child = i1.breed(i2);
		assertEquals(Allele.Dominant, child.getA1());
		assertEquals(Allele.Dominant, child.getA2());
		assertEquals(0l, child.getAge());
		
	}

}
