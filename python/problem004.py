from common import mathutil

def main() :
	palindromes = []
	for i in range(100, 1000):
		for j in range(100, 1000):
			if mathutil.isPalindrome(i * j):
				palindromes.append(i * j)
	print(max(palindromes))
	
if __name__ == "__main__":
	main()