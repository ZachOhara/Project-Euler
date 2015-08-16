
def main():
	print(sumDigits(2 ** 1000))

def sumDigits(n):
	digitSum = 0
	for c in str(n):
		digitSum += int(c)
	return digitSum
	
if __name__ == '__main__':
	main()