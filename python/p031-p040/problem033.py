from common import factors
import functools
import operator

def main():
	nums = []
	dens = []
	for d in range(10, 100):
		for n in range(10, d):
			if isCuriousFraction(n, d):
				nums.append(n)
				dens.append(d)
	numsP = productOf(nums)
	densP = productOf(dens)
	print(int(densP / factors.gcd(numsP, densP)))
	
def productOf(itr):
	return functools.reduce(operator.mul, itr)

def isCuriousFraction(num, den):
	numStr = str(num)
	denStr = str(den)
	if numStr[0] == denStr[1] and denStr[0] != '0':
		return num / den == int(numStr[1]) / int(denStr[0])
	elif numStr[1] == denStr[0] and denStr[1] != '0':
		return num / den == int(numStr[0]) / int(denStr[1])
	else:
		return False

if __name__ == "__main__":
	main()