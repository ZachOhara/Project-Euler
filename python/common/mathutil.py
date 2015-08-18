
def containsFactor(itr, n):
	for i in itr:
		if n % i == 0:
			return True
	return False

def isPalindrome(x):
	return str(x) == str(x)[::-1]
	
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

def isPandigital(n):
	n = str(n)
	for i in range(1, 10):
		c = n.count(str(i))
		if not c:
			return i - 1
		if c > 1:
			return 0
	return 9

def isPandigital9(n):
	return len(str(n)) == 9 and isPandigital(n) == 9

if __name__ == "__main__":
	print(collatzSequence(13))
		
