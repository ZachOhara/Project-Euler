from common import mathutil

def main():
	nums = []
	for p in mathutil.pandigitalNumbers(start=0, end=9):
		print(p)
		if hasSSproperty(p):
			nums.append(p)
	print(sum(nums))

def hasSSproperty(n):
	n = str(n)
	divisors = [2, 3, 5, 7, 11, 13, 17]
	for i in range(2, 9):
		if int(n[i-1:i+2]) % divisors.pop(0) != 0:
			return False
	return True

if __name__ == "__main__":
	main()
