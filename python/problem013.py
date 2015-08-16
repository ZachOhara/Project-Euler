
FILE_ADDRESS = "../res/problem013/numbers.txt"

def main():
	nums = generateNumbersList()
	print(str(sum(nums))[:10])

def generateNumbersList():
	nums = []
	for line in open(FILE_ADDRESS, 'r'):
		nums.append(int(line[:-1]))
	return nums

if __name__ == '__main__':
	main()