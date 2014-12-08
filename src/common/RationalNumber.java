package common;

import java.util.ArrayList;

import common.OharaMath;

public class RationalNumber implements Comparable<RationalNumber> {
	
	private int num;
	private int den;
	
	public RationalNumber(int n, int d) {
		if (d == 0)
			throw new IllegalArgumentException();
		this.num = n;
		this.den = d;
	}
	
	public RationalNumber() {
		this(0, 1);
	}
	
	public int getNumerator() {
		return this.num;
	}
	
	public int getDenominator() {
		return this.den;
	}
	
	public double decimalValue() {
		return (double)this.num / this.den;
	}
	
	public RationalNumber simplify() {
		if (this.num == 0)
			this.den = 1;
		int gcd = OharaMath.gcd(this.num, this.den);
		this.num /= gcd * OharaMath.signum(this.den);
		this.den /= gcd * OharaMath.signum(this.den);
		return this;
	}
	
	public RationalNumber negative(RationalNumber rn) {
		return new RationalNumber(-rn.num, rn.den);
	}
	
	public RationalNumber add(RationalNumber other) {
		int num = (this.num * other.den) + (other.num * this.den);
		int den = this.den * other.den;
		return new RationalNumber(num, den);
	}
	
	public RationalNumber subtract(RationalNumber other) {
		return this.add(negative(other));
	}
	
	public RationalNumber addSimplify(RationalNumber other) {
		return this.add(other);
	}
	
	public RationalNumber subtractSimplify(RationalNumber other) {
		return subtract(other).simplify();
	}
	
	public RationalNumber copyData() {
		return new RationalNumber(this.num, this.den);
	}
	
	public boolean isContained(RationalNumber[] rnarray) {
		for (int i = 0; i < rnarray.length; i++)
			if (this.equals(rnarray[i]))
				return true;
		return false;
	}
	
	public boolean isContained(ArrayList<RationalNumber> rnarray) {
		for (int i = 0; i < rnarray.size(); i++)
			if (this.equals(rnarray.get(i)))
				return true;
		return false;
	}
	
	public String toString() {
		if (this.den == 1)
			return "" + this.num;
		else
			return this.num + "/" + this.den;
	}
	
	public boolean equals(RationalNumber other) {
		/*
		RationalNumber simplifyThis = this.copyData().simplify();
		RationalNumber simplifyOther = other.copyData().simplify();
		return (simplifyThis.num == simplifyOther.num && simplifyThis.den == simplifyOther.den);
		*/
		if (other == null)
			return false;
		return this.compareTo(other) == 0;
	}
	
	public int compareTo(RationalNumber other) {
		double thisdecimal = this.decimalValue();
		double otherdecimal = other.decimalValue();
		if (thisdecimal < otherdecimal)
			return -1;
		else if (otherdecimal < thisdecimal)
			return 1;
		return 0;
	}
}
