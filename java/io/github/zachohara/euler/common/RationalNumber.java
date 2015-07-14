/* Copyright (C) 2015 Zach Ohara
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.zachohara.euler.common;

public class RationalNumber implements Comparable<Object> {

	private int num;
	private int den;

	// Constructors:
	// Construct a new RationalNumber from a given numerator and denominator
	public RationalNumber(int n, int d) {
		if (d == 0)
			throw new IllegalArgumentException();
		this.num = n;
		this.den = d;
		this.simplify();
	}

	// Construct a new RationalNumber with the same value as the given RationalNumber
	public RationalNumber(RationalNumber r) {
		this(r.num, r.den);
	}

	// Construct a new RationalNumber with the value of the given integer
	public RationalNumber(int n) {
		this(n, 1);
	}

	// Construct a new RationalNumber with the value of zero
	public RationalNumber() {
		this(0, 1);
	}

	// Getters:
	// Returns the numerator of this RationalNumber
	public int getNumerator() {
		return this.num;
	}

	// Returns the denominator of this RationalNumber
	public int getDenominator() {
		return this.den;
	}

	// Returns the approximate decimal value of this RationalNumber
	public double decimalValue() {
		return (double)this.num / this.den;
	}

	// Other Methods:
	// Simplify the rational number
	public RationalNumber simplify() {
		if (this.num == 0)
			this.den = 1;
		int gcd = OharaMath.gcd(this.num, this.den);
		this.num /= gcd * OharaMath.signum(this.den);
		this.den /= gcd * OharaMath.signum(this.den);
		return this;
	}

	public RationalNumber negate() {
		this.num *= -1;
		this.simplify();
		return this;
	}

	public RationalNumber add(RationalNumber r) {
		int num = (this.num * r.den) + (r.num * this.den);
		int den = this.den * r.den;
		return new RationalNumber(num, den).simplify();
	}

	public RationalNumber subtract(RationalNumber r) {
		return this.add(new RationalNumber(r).negate());
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		return this.compareTo(obj) == 0;
	}

	public int compareTo(Object obj) {
		double thisval = this.decimalValue();
		double otherval = 0;
		if (obj instanceof RationalNumber)
			otherval = ((RationalNumber) obj).decimalValue();
		else if (obj instanceof Integer)
			otherval = new Double((Integer)obj);
		else if (obj instanceof Double)
			otherval = (Double)(obj);
		else
			throw new ClassCastException();

		if (thisval < otherval)
			return -1;
		else if (otherval < thisval)
			return 1;
		return 0;
	}

	public String toString() {
		if (this.den == 1)
			return "" + this.num;
		else
			return this.num + "/" + this.den;
	}
}
