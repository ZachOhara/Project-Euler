from common import sequence
import math

def main():
	print(octagonalNumsTo(66))

def octagonalNumbers():
	octag = 1
	delta = 7
	while True:
		yield octag
		octag += delta
		delta += 6
		
def octagonalNumsTo(limit):
	return sequence.sequenceTo(octagonalNumbers, limit)

def octagonalTerms(terms):
	return sequence.sequenceTerms(octagonalNumbers, terms)

def isOctagonal(o):
	n = (1 - math.sqrt((3 * o) + 1)) / 3
	return n == int(n)

if __name__ == "__main__":
	main()
