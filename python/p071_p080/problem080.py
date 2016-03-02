from common import mathutil

import decimal

def main():
	decimal.getcontext().prec = 110
	total = 0
	for i in range(1, 100):
		if not mathutil.isPower(i, 2):
			total += sumOfDigits(i)
	print(total)
	
def sumOfDigits(n):
	dec = str(decimal.Decimal(n).sqrt())
	i = dec.index('.')
	dec = dec[i + 1: i + 100] #-1]
	return sum(int(i) for i in dec) + int(n ** .5)

if __name__ == "__main__":
	main()
