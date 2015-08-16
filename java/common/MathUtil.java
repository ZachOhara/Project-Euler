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

package common;

import java.util.ArrayList;
import java.util.List;

public class MathUtil {
	
	public static void main(String[] args) {
//		System.out.println(isPrime(4));
//		System.out.println("factors: " + factorsOf(100));
		System.out.println(primeFactorsOf(13195));
	}
	
	public static List<Integer> fibonacciTo(int cap) {
		List<Integer> fibList = new ArrayList<Integer>();
		fibList.add(1);
		fibList.add(2);
		while (fibList.get(fibList.size() - 1) < cap) {
			fibList.add(fibList.get(fibList.size() - 1) + fibList.get(fibList.size() - 2));
		}
		fibList.remove(fibList.size() - 1);
		return fibList;
	}
	
	 public static List<Integer> factorsOf(int n) {
		 List<Integer> factorList = new ArrayList<Integer>();
		 int div = 1;
		 while (!factorList.contains(div)) {
			 if (n % div == 0) {
				 factorList.add(div);
				 if (div * div != n) {
					 factorList.add(n / div);
				 }
			 }
			 div ++;
		 }
		 return factorList;
	 }
	 
	 public static boolean isPrime(int n) {
		 return factorsOf(n).size() == 2;
	 }
	 
	 public static List<Integer> primeFactorsOf(int n) {
		 List<Integer> primeFactorList = factorsOf(n);
		 primeFactorList.remove((Object) n);
		 primeFactorList.remove((Object) 1);
		 for (int i = primeFactorList.size() - 1; i >= 0; i--) {
			 if (!isPrime(primeFactorList.get(i))) {
				 primeFactorList.remove(i);
			 }
		 }
		 return primeFactorList;
	 }
		
//		public static List<BigInteger> fibonacciTo(BigInteger cap) {
//			List<BigInteger> fibList = new ArrayList<BigInteger>();
//			fibList.add(BigInteger.valueOf(1));
//			fibList.add(BigInteger.valueOf(2));
//			while (fibList.get(fibList.size() - 1).compareTo(cap) < 0) {
//				fibList.add(fibList.get(fibList.size() - 1).add(fibList.get(fibList.size() - 2)));
//			}
//			fibList.remove(fibList.size() - 1);
//			return fibList;
//		}
	
//	 public static List<BigInteger> factorsOf(BigInteger n) {
//		 List<BigInteger> factorList = new ArrayList<BigInteger>();
//		 BigInteger div = BigInteger.ONE;
//		 while (!factorList.contains(div)) {
//			 if (n.mod(div).equals(BigInteger.ZERO)) {
//				 factorList.add(div);
//				 if (!div.pow(2).equals(n)) {
//					 factorList.add(n.divide(div));
//				 }
//			 }
//			 div.add(BigInteger.ONE);
//		 }
//		 return factorList;
//	 }
	 
//	 public static boolean isPrime(BigInteger n) {
//		 return factorsOf(n).size() == 2;
//	 }
	 
//	 public static List<BigInteger> primeFactorsOf(BigInteger n) {
//		 List<BigInteger> primeFactorList = factorsOf(n);
//		 primeFactorList.remove((Object) n);
//		 primeFactorList.remove((Object) 1);
//		 for (int i = primeFactorList.size() - 1; i >= 0; i--) {
//			 if (!isPrime(primeFactorList.get(i))) {
//				 primeFactorList.remove(i);
//			 }
//		 }
//		 return primeFactorList;
//	 }
	
}
