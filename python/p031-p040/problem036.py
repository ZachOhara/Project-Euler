from common import mathutil

def main():
	print(sum(doublePalindromesBelow(1000000)))
	
def doublePalindromesBelow(limit):
	palindromes = []
	for i in range(limit):
		if isDoublePalindrome(i):
			palindromes.append(i)
	return palindromes

def isDoublePalindrome(n):
	return mathutil.isPalindrome(n) and mathutil.isPalindrome(bin(n)[2:])

if __name__ == "__main__":
	main()