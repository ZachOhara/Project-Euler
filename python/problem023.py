from common import fileio

def main():
	fileio.FILE_ADDRESS = "../res/problem023/abundantnumbers.txt"
	abundantSumsList = fileio.readFileAsList()
	print(len(abundantSumsList))
	abundantIntegersSum = sum(abundantCombinationSums(abundantSumsList))
	print(sum(range(28124)) - abundantIntegersSum)

def abundantCombinationSums(abundantSums):
	comboSums = []
	for i in abundantSums:
		print(i)
		for j in abundantSums:
			s = i + j
			if s > 28123:
				break
			if s not in comboSums:
				comboSums.append(s)
	return comboSums

'''
def isAbundantSum(n, abundantSums):
	for i in abundantSums:
		if i >= n:
			return False
		if n - i in abundantSums:
			return True
	return False
'''

'''
def writeSumsToFile():
	output = open("../res/problem023/abundantnumbers.txt", 'w')
	for a in abundantSumsGen(28123):
		output.write(str(a) + '\n')
	output.close()

def abundantSumsGen(limit):
	i = 12
	while i < limit:
		if not i % 1000: print("generating...", i)
		if factors.isAbundant(i):
			yield i
		i += 1
'''

if __name__ == "__main__":
	main()