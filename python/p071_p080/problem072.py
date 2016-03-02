import sys
from common import timer

import fractions

def main():
    print(len(createFractionSet(400)))
    
def createFractionSet(denominator):
    fractionList = []
    for d in range(1, denominator + 1):
        for n in range(1, d):
            fractionList.append(fractions.Fraction(n, d))
    return set(fractionList)
	
if __name__ == '__main__':
	main()
