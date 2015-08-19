from common import sequence
import math

def main():
	print(hexagonalNumsTo(46))

def hexagonalNumbers():
	hexag = 1
	delta = 5
	while True:
		yield hexag
		hexag += delta
		delta += 4
		
def hexagonalNumsTo(limit):
	return sequence.sequenceTo(hexagonalNumbers, limit)

def hexagonalTerms(terms):
	return sequence.sequenceTerms(hexagonalNumbers, terms)

def isHexagonal(h):
	n = (math.sqrt((8 * h) + 1) + 1) / 4
	return n == int(n)

if __name__ == "__main__":
	main()
