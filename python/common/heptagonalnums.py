from common import sequence
import math

def main():
	print(heptagonalNumsTo(56))

def heptagonalNumbers():
	heptag = 1
	delta = 6
	while True:
		yield heptag
		heptag += delta
		delta += 5
		
def heptagonalNumsTo(limit):
	return sequence.sequenceTo(heptagonalNumbers, limit)

def hexagonalTerms(terms):
	return sequence.sequenceTerms(heptagonalNumbers, terms)

def isHeptagonal(h):
	n = (3 - math.sqrt((40 * h) + 9)) / 10
	return n == int(n)

if __name__ == "__main__":
	main()
