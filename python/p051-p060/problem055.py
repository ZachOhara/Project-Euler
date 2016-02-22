from common import mathutil

def main():
	lyrachelCount = 0
	for i in range(1, 10000):
		if isLychrel(i):
			lyrachelCount += 1
	print(lyrachelCount)

def isLychrel(n):
	for i in range(50):
		n = n + mathutil.reverse(n)
		if mathutil.isPalindrome(n):
			return False
	return True
	
if __name__ == '__main__':
	main()
