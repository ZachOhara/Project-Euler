import itertools

DIGITS = ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

def containsFactor(itr, n):
	for i in itr:
		if n % i == 0:
			return True
	return False

def isPalindrome(x):
	return str(x) == str(x)[::-1]

def reverse(n):
	return int(str(n)[::-1])
	
def isPythagorean(itr):
	if len(itr) != 3:
		return False
	c = max(itr)
	itr.remove(c)
	a, b, = itr
	return a ** 2 + b ** 2 == c ** 2
		
def collatzSequence(n):
	seq = [n]
	while seq[-1] != 1:
		if seq[-1] % 2 == 0:
			seq.append(int(seq[-1] / 2))
		else:
			seq.append((seq[-1] * 3) + 1)
	return seq

def sumOfDigits(n):
	digitSum = 0
	for c in str(n):
		digitSum += int(c)
	return digitSum

def pandigitalNumbers(start=1, end=9):
	available = DIGITS[start : end + 1]
	return [int(''.join(p)) for p in itertools.permutations(available)]

def isPandigital(n):
	n = str(n)
	for i in range(1, 10):
		c = n.count(str(i))
		if not c:
			if len(n) == i - 1:
				return i - 1
			return 0
		if c > 1:
			return 0
	return 9

def isPandigital9(n):
	return len(str(n)) == 9 and isPandigital(n) == 9

if __name__ == "__main__":
	print(pandigitalNumbers(1, 5))
		
