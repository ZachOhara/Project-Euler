from common import sequence
import math

def main():
	print(pentagonalNumsTo(146))

def pentagonalNumbers():
	pent = 1
	delta = 4
	while True:
		yield pent
		pent += delta
		delta += 3
		
def pentagonalNumsTo(limit):
	return sequence.sequenceTo(pentagonalNumbers, limit)

def pentagonalTerms(terms):
	return sequence.sequenceTerms(pentagonalNumbers, terms)

def isPentagonal(p):
	n = (math.sqrt((24 * p) + 1) + 1) / 6
	return n == int(n)

if __name__ == "__main__":
	main()
