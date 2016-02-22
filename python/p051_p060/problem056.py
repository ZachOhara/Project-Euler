from common import mathutil

def main():
	digitSums = []
	for a in range(100):
		for b in range(100):
			digitSums.append(mathutil.sumOfDigits(a ** b))
	print(max(digitSums))

if __name__ == '__main__':
	main()
