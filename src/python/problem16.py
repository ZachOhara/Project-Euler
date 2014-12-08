#Problem16.py

def sumOfDigits(n):
	sum = 0
	while n > 0:
		sum += n%10
		n = int(n/10)
	return sum

print(sumOfDigits(2**15))
print(sumOfDigits(2**1000))