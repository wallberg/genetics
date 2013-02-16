package org.wallberg.genetics;

import java.util.Random;

public class Individual {
	enum Allele {
		Dominant, Recessive
	}
	
	enum Gender {
		Male, Female
	}
	
	Allele a1;
	Allele a2;
	Gender gender;
	long age;
	
	private final static Random r = new Random();
	
	public Individual(Allele a1, Allele a2, Gender gender) {
		this.a1 = a1;
		this.a2 = a2;
		this.gender = gender;
		this.age = 0;
	}
	
	public Allele getA1() {
		return a1;
	}
	
	public void setA1(Allele a1) {
		this.a1 = a1;
	}
	
	public Allele getA2() {
		return a2;
	}
	
	public void setA2(Allele a2) {
		this.a2 = a2;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public long getAge() {
		return age;
	}
	
	public void setAge(long age) {
		this.age = age;
	}
	
	public Individual breed (Individual partner) {
		assert this.gender != partner.gender;
		
		Individual child = new Individual(
				(r.nextInt(2) == 0 ? this.a1 : this.a2),
				(r.nextInt(2) == 0 ? partner.a1 : partner.a2),
				(r.nextInt(2) == 0 ? Gender.Female : Gender.Male)
				);
		
		return child;
		
	}
	
}
