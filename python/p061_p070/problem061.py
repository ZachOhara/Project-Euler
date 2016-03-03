from common import trianglenums
from common import squarenums
from common import pentagonalnums
from common import hexagonalnums
from common import heptagonalnums
from common import octagonalnums

LIMIT = 10 ** 4

TRIANGLULAR_NUMBERS = []
SQUARE_NUMBERS = []
PENTAGONAL_NUMBERS = []
HEXAGONAL_NUMBERS = []
HEPTAGONAL_NUMBERS = []
OCTAGONAL_NUMBERS = []

def main():
	TRIANGLULAR_NUMBERS = [i for i in trianglenums.triangleNumsTo(LIMIT) if i > 1000]
	SQUARE_NUMBERS = [i for i in squarenums.squareNumsTo(LIMIT) if i > 1000]
	PENTAGONAL_NUMBERS = [i for i in pentagonalnums.pentagonalNumsTo(LIMIT) if i > 1000]
	HEXAGONAL_NUMBERS = [i for i in hexagonalnums.hexagonalNumsTo(LIMIT) if i > 1000]
	HEPTAGONAL_NUMBERS = [i for i in heptagonalnums.heptagonalNumsTo(LIMIT) if i > 1000]
	OCTAGONAL_NUMBERS = [i for i in octagonalnums.octagonalNumsTo(LIMIT) if i > 1000]
	
	for tria in TRIANGLULAR_NUMBERS:
		print(tria)
		for squa in SQUARE_NUMBERS:
			for pent in PENTAGONAL_NUMBERS:
				for hexa in HEXAGONAL_NUMBERS:
					if uniqueSides([tria, squa, pent, hexa]) < 2:
						continue
					for hept in HEPTAGONAL_NUMBERS:
						if uniqueSides([tria, squa, pent, hexa, hept]) < 4:
							continue
						for octa in OCTAGONAL_NUMBERS:
							if isCyclic([tria, squa, pent, hexa, hept, octa]):
								print([tria, squa, pent, hexa, hept, octa])
								print(sum([tria, squa, pent, hexa, hept, octa]))
								return

def uniqueSides(numList):
	fronts = [str(i)[:2] for i in numList]
	backs = [str(i)[2:] for i in numList]
	return len(set(fronts).intersection(backs))

def isCyclic(origNumList):
	if uniqueSides(origNumList) != 6:
		return False
	for i in range(len(origNumList)):
		numList = origNumList[:]
		#print(i)
		cyclicList = [numList.pop(i)]
		while len(numList) > 0 and searchForCycle(cyclicList, numList):
			continue
		if len(numList) == 0:
			return True
	return False
	
def searchForCycle(cyclicList, numList):
	a = cyclicList[-1]
	for b in numList:
		if doNumbersConnect(a, b):
			numList.remove(b)
			cyclicList.append(b)
			return True
	return False
	
def doNumbersConnect(a, b):
	return str(a)[2:] == str(b)[:2]

if __name__ == "__main__":
	main()
