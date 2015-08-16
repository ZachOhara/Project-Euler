from common import fibonacci

def main():
	print(evenFibSum(4000000))
	
def evenFibSum(cap):
	fibList = fibonacci.fibonacciTo(cap)
	evenSum = 0
	for i in fibList:
		if i % 2 == 0:
			evenSum += i 
	return evenSum

if __name__ == "__main__":
	main()
