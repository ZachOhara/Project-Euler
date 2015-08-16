
import common.mathUtil as mathUtil

def evenFibSum(cap):
	fibList = mathUtil.fibonacciTo(cap)
	evenSum = 0
	for i in fibList:
		if i % 2 == 0:
			evenSum += i 
	return evenSum

print(evenFibSum(4000000))
